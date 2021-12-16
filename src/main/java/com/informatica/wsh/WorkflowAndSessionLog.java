package com.informatica.wsh;

import java.util.Map;

public class WorkflowAndSessionLog {

    private String workflowLog;

    private Map<String, String> sessionLogs;

    public String getWorkflowLog() {
        return workflowLog;
    }

    public void setWorkflowLog(String workflowLog) {
        this.workflowLog = workflowLog;
    }

    public Map<String, String> getSessionLogs() {
        return sessionLogs;
    }

    public void setSessionLogs(Map<String, String> sessionLogs) {
        this.sessionLogs = sessionLogs;
    }
}
