package com.informatica.wsh;

public interface WshConstants {

    String PROPERTIES_FILE_PATH = "/infa-wsh.properties";

    String INVALID_SESSION_ID_ERR_MSG = "Session ID is not valid.";

    String PROP_INFA_WSDL_DATA_INTEGRATION = "infa.wsh.wsdl.dataIntegration";
    String PROP_INFA_WSDL_METADATA = "infa.wsh.wsdl.metadata";
    String PROP_INFA_REPO_NAME = "infa.repoName";
    String PROP_INFA_SERVICE_NAME = "infa.serviceName";
    String PROP_INFA_USERNAME = "infa.username";
    String PROP_INFA_PASSWORD = "infa.password";
    String PROP_INFA_RETRY_MAX_COUNT = "infa.retry.maxCount";

    String TASK_TYPE_SESSION = "SessionTask";

    int GET_LOG_TIMEOUT = 30000;
}
