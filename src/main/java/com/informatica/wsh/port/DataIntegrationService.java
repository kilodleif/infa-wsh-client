
package com.informatica.wsh.port;

import com.informatica.wsh.WshConstants;
import com.informatica.wsh.intf.DataIntegrationInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DataIntegrationService", targetNamespace = "http://www.informatica.com/wsh", wsdlLocation = "http://congos:7333/wsh/services/BatchServices/DataIntegration?WSDL")
public class DataIntegrationService extends Service implements WshConstants {

    private final static URL DATAINTEGRATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException DATAINTEGRATIONSERVICE_EXCEPTION;
    private final static QName DATAINTEGRATIONSERVICE_QNAME = new QName("http://www.informatica.com/wsh", "DataIntegrationService");

    static {
        URL url = null;
        WebServiceException e = null;

        try {
            Properties properties = new Properties();
            properties.load(DataIntegrationService.class.getResourceAsStream(PROPERTIES_FILE_PATH));
            url = new URL(properties.getProperty(PROP_INFA_WSDL_DATA_INTEGRATION));
        } catch (IOException ex) {
            e = new WebServiceException(ex);
        }
        DATAINTEGRATIONSERVICE_WSDL_LOCATION = url;
        DATAINTEGRATIONSERVICE_EXCEPTION = e;
    }

    public DataIntegrationService() {
        super(__getWsdlLocation(), DATAINTEGRATIONSERVICE_QNAME);
    }

    /**
     * 
     * @return
     *     returns DataIntegrationInterface
     */
    @WebEndpoint(name = "DataIntegration")
    public DataIntegrationInterface getDataIntegration() {
        return super.getPort(new QName("http://www.informatica.com/wsh", "DataIntegration"), DataIntegrationInterface.class);
    }

    private static URL __getWsdlLocation() {
        if (DATAINTEGRATIONSERVICE_EXCEPTION!= null) {
            throw DATAINTEGRATIONSERVICE_EXCEPTION;
        }
        return DATAINTEGRATIONSERVICE_WSDL_LOCATION;
    }

}
