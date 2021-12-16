package com.informatica.wsh;

import com.informatica.wsh.enums.ETaskRunStatus;
import com.informatica.wsh.enums.EWorkflowRunStatus;

import java.util.Map;

public class WorkflowAndSessionStatus {

    private EWorkflowRunStatus workflowRunStatus;

    private Map<String, ETaskRunStatus> sessionsRunStatus;

    public EWorkflowRunStatus getWorkflowRunStatus() {
        return workflowRunStatus;
    }

    public void setWorkflowRunStatus(EWorkflowRunStatus workflowRunStatus) {
        this.workflowRunStatus = workflowRunStatus;
    }

    public Map<String, ETaskRunStatus> getSessionsRunStatus() {
        return sessionsRunStatus;
    }

    public void setSessionsRunStatus(Map<String, ETaskRunStatus> sessionsRunStatus) {
        this.sessionsRunStatus = sessionsRunStatus;
    }
}
