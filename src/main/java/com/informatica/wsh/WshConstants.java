package com.informatica.wsh;

public interface WshConstants {

    String METADATA_WSDL_LOCATION_FMT = "http://%s:%d/wsh/services/BatchServices/Metadata?WSDL";

    String DATAINT_WSDL_LOCATION_FMT = "http://%s:%d/wsh/services/BatchServices/DataIntegration?WSDL";

    int RETRY_MAX_COUNT = 3;

    String INVALID_SESSION_ID_ERR_MSG = "Session ID is not valid.";

    String TASK_TYPE_SESSION = "SessionTask";

    int GET_LOG_TIMEOUT = 30000;
}
