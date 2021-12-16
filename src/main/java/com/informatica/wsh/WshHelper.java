package com.informatica.wsh;

import com.informatica.wsh.enums.ETaskRunMode;
import com.informatica.wsh.enums.ETaskRunStatus;
import com.informatica.wsh.exception.Fault;
import com.informatica.wsh.exception.WshInitException;
import com.informatica.wsh.intf.DataIntegrationInterface;
import com.informatica.wsh.intf.MetadataInterface;
import com.informatica.wsh.port.DataIntegrationService;
import com.informatica.wsh.port.MetadataService;
import com.informatica.wsh.type.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Informatica Web Service Hub工具类
 *
 * @author kilodleif@gmail.com
 * @since 1.0
 */
public class WshHelper implements WshConstants {

    private static WshHelper wshHelper = null;

    private final MetadataInterface metadataInterface;
    private final DataIntegrationInterface dataIntegrationInterface;

    private static String cachedHostname = "";
    private static int cachedPort = 0;

    private InfaAuthInfo authInfo;
    private SessionHeader sessionHeader;
    private final DIServiceInfo serviceInfo;

    private WshHelper(String hostname, int port, InfaAuthInfo authInfo) throws MalformedURLException {
        String metadataUrlStr = String.format(METADATA_WSDL_LOCATION_FMT, hostname, port);
        String dataIntUrlStr = String.format(DATAINT_WSDL_LOCATION_FMT, hostname, port);
        metadataInterface = new MetadataService(new URL(metadataUrlStr)).getMetadata();
        dataIntegrationInterface = new DataIntegrationService(new URL(dataIntUrlStr)).getDataIntegration();
        // 初始化鉴权信息
        initAuthInfo(authInfo);
        // 获取session头
        sessionHeader = getSessionHeader();
        // 构造service info
        serviceInfo = new DIServiceInfo(authInfo.getServiceName());
    }

    private void initAuthInfo(InfaAuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    /**
     * 当hostname和port发生变化时重新创建新实例，否则返回旧实例
     *
     * @param hostname 主机名
     * @param port 端口号
     * @param authInfo 鉴权信息
     * @return WshHelper实例
     */
    public static WshHelper createIfLocationChanged(String hostname, int port, InfaAuthInfo authInfo) {
        if (!cachedHostname.equals(hostname) || cachedPort != port) {
            try {
                wshHelper = new WshHelper(hostname, port, authInfo);
                cachedHostname = hostname;
                cachedPort = port;
            } catch (IOException e) {
                throw new WshInitException("creating WshHelper instance failed.", e);
            }
        }
        return wshHelper;
    }

    private SessionHeader getSessionHeader() {
        SessionHeader sessionHeader;
        try {
            LoginRequest request = new LoginRequest();
            request.setRepositoryName(authInfo.getRepoName());
            request.setUserName(authInfo.getUsername());
            request.setPassword(authInfo.getPassword());
            String sessionId = metadataInterface.login(request, null);
            sessionHeader = new SessionHeader();
            sessionHeader.setSessionId(sessionId);
        } catch (Fault e) {
            sessionHeader = null;
        }
        return sessionHeader;
    }

    /**
     * 获得数据集成ws接口
     *
     * @return 数据集成ws接口
     */
    public DataIntegrationInterface getDataIntegrationInterface() {
        return dataIntegrationInterface;
    }

    /**
     * 获得元数据ws接口
     *
     * @return 元数据ws接口
     */
    public MetadataInterface getMetadataInterface() {
        return metadataInterface;
    }

    /**
     * 以文件夹维度获取所有工作流
     *
     * @return map (文件夹名称 -> 工作流名称list)
     */
    public Map<String, List<String>> getAllWorkflowsByFolders() throws Fault {
        return getAllWorkflowsByFoldersWithRetry(0);
    }

    private Map<String, List<String>> getAllWorkflowsByFoldersWithRetry(int retryCount) throws Fault {
        if (retryCount > RETRY_MAX_COUNT) {
            throw new Fault("Retry times reached max!", new FaultDetails());
        }
        try {
            Map<String, List<String>> resultMap = new HashMap<>();
            FolderInfoArray folderInfoArray = metadataInterface.getAllFolders(null, sessionHeader);
            List<FolderInfo> folderInfoList = folderInfoArray.getFolderInfo();
            for (FolderInfo folderInfo : folderInfoList) {
                WorkflowInfoArray workflowInfoArray = metadataInterface.getAllWorkflows(folderInfo, sessionHeader);
                List<WorkflowInfo> workflowInfoList = workflowInfoArray.getWorkflowInfo();
                List<String> workflowNameList = workflowInfoList.stream()
                        .map(WorkflowInfo::getName).collect(Collectors.toList());
                resultMap.put(folderInfo.getName(), workflowNameList);
            }
            return resultMap;
        } catch (Fault e) {
            if (INVALID_SESSION_ID_ERR_MSG.equals(e.getMessage())) {
                sessionHeader = getSessionHeader();
                return getAllWorkflowsByFoldersWithRetry(++retryCount);
            } else {
                throw e;
            }
        }
    }

    /**
     * 执行指定的工作流，并返回执行状态
     *
     * @param folderName 文件夹名称
     * @param workflowName 工作流名称
     *
     * @return 工作流及其下会话任务执行状态
     * @throws Fault 执行工作流异常
     */
    public WorkflowAndSessionStatus startWorkflow(String folderName, String workflowName) throws Fault {
        return startWorkflowWithRetry(folderName, workflowName, 0);
    }

    private WorkflowAndSessionStatus startWorkflowWithRetry(String folderName, String workflowName, int retryCount)
            throws Fault {
        if (retryCount > RETRY_MAX_COUNT) {
            throw new Fault("Retry times reached max!", new FaultDetails());
        }
        try {
            WorkflowRequest request = new WorkflowRequest();
            request.setDIServiceInfo(serviceInfo);
            request.setRequestMode(ETaskRunMode.NORMAL);
            request.setFolderName(folderName);
            request.setWorkflowName(workflowName);
            try {
                // 启动工作流
                dataIntegrationInterface.startWorkflow(request, sessionHeader);
                // 等待工作流完成
                dataIntegrationInterface.waitTillWorkflowComplete(request, sessionHeader);
            } catch (Fault f) {
                // 报错信息中包含 “有关详细信息，请查看工作流日志” 表示工作流本身执行失败，仍然获取执行状态
                // 否则将异常抛出
                if (f.getMessage() == null || !f.getMessage().contains("有关详细信息，请查看工作流日志")) {
                    throw f;
                }
            }
            // 获取工作流执行状态
            WorkflowDetails workflowDetails = dataIntegrationInterface.getWorkflowDetails(request, sessionHeader);
            // 获取会话任务执行状态
            List<String> sessionNames = getSessionNames(folderName, workflowName);
            Map<String, ETaskRunStatus> sessionsRunStatus = new HashMap<>();
            for (String sessionName : sessionNames) {
                GetSessionStatisticsRequest gssr = new GetSessionStatisticsRequest();
                gssr.setDIServiceInfo(serviceInfo);
                gssr.setWorkflowName(workflowName);
                gssr.setFolderName(folderName);
                gssr.setTaskInstancePath(sessionName);
                SessionStatistics sessionStatistics = dataIntegrationInterface.getSessionStatistics(gssr, sessionHeader);
                sessionsRunStatus.put(sessionName, sessionStatistics.getTaskRunStatus());
            }

            WorkflowAndSessionStatus result = new WorkflowAndSessionStatus();
            result.setWorkflowRunStatus(workflowDetails.getWorkflowRunStatus());
            result.setSessionsRunStatus(sessionsRunStatus);
            return result;
        } catch (Fault e) {
            if (INVALID_SESSION_ID_ERR_MSG.equals(e.getMessage())) {
                sessionHeader = getSessionHeader();
                return startWorkflowWithRetry(folderName, workflowName, ++retryCount);
            } else {
                throw e;
            }
        }
    }

    /**
     * 获取工作流及其下会话任务的日志
     *
     * @param folderName 文件夹名称
     * @param workflowName 工作流名称
     * @return WorkflowAndSessionLog
     * @throws Fault 获取日志异常
     */
    public WorkflowAndSessionLog getWorkflowAndSessionLog(String folderName, String workflowName) throws Fault {
        return getWorkflowAndSessionLogWithRetry(folderName, workflowName, 0);
    }

    private WorkflowAndSessionLog getWorkflowAndSessionLogWithRetry(String folderName, String workflowName, int retryCount)
            throws Fault {
        try {
            String workflowLog = getWorkflowLog(folderName, workflowName);
            Map<String, String> sessionLogs = getSessionLogs(folderName, workflowName);
            WorkflowAndSessionLog result = new WorkflowAndSessionLog();
            result.setWorkflowLog(workflowLog);
            result.setSessionLogs(sessionLogs);
            return result;
        } catch (Fault e) {
            if (INVALID_SESSION_ID_ERR_MSG.equals(e.getMessage())) {
                sessionHeader = getSessionHeader();
                return getWorkflowAndSessionLogWithRetry(folderName, workflowName, ++retryCount);
            } else {
                throw e;
            }
        }
    }

    // 获取工作流的执行日志
    private String getWorkflowLog(String folderName, String workflowName) throws Fault {
        GetWorkflowLogRequest request = new GetWorkflowLogRequest();
        request.setDIServiceInfo(serviceInfo);
        request.setTimeout(GET_LOG_TIMEOUT);
        request.setFolderName(folderName);
        request.setWorkflowName(workflowName);
        Log workflowLog = dataIntegrationInterface.getWorkflowLog(request, sessionHeader);
        return workflowLog.getBuffer();
    }

    // 获取工作流下所有会话任务的名称
    private List<String> getSessionNames(String folderName, String workflowName) throws Fault {
        GetAllTaskInstancesRequest gatir = new GetAllTaskInstancesRequest();
        gatir.setWorkflowInfo(new WorkflowInfo(workflowName, folderName, true));
        gatir.setDepth(5);
        TaskInstanceInfoArray instListArray = metadataInterface.getAllTaskInstances(gatir, sessionHeader);
        List<TaskInstanceInfo> instList = instListArray.getTaskInstanceInfo();
        return instList.stream()
                .filter(inst -> TASK_TYPE_SESSION.equals(inst.getType()))
                .map(TaskInstanceInfo::getName).collect(Collectors.toList());
    }

    // 获取工作流下所有会话任务的执行日志
    private Map<String, String> getSessionLogs(String folderName, String workflowName) throws Fault {
        Map<String, String> resultMap = new HashMap<>();
        List<String> sessionTaskNames = getSessionNames(folderName, workflowName);
        for (String sessionName : sessionTaskNames) {
            GetSessionLogRequest gslr = new GetSessionLogRequest();
            gslr.setDIServiceInfo(serviceInfo);
            gslr.setTimeout(GET_LOG_TIMEOUT);
            gslr.setFolderName(folderName);
            gslr.setWorkflowName(workflowName);
            gslr.setTaskInstancePath(sessionName);
            Log sessionLog = dataIntegrationInterface.getSessionLog(gslr, sessionHeader);
            resultMap.put(sessionName, sessionLog.getBuffer());
        }
        return resultMap;
    }

}
