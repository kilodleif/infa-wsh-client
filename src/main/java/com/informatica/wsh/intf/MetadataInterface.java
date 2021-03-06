
package com.informatica.wsh.intf;

import com.informatica.wsh.*;
import com.informatica.wsh.exception.Fault;
import com.informatica.wsh.type.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MetadataInterface", targetNamespace = "http://www.informatica.com/wsh")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MetadataInterface {


    /**
     * 
     * @param param
     * @param context
     * @return
     *     returns java.lang.String
     * @throws Fault
     */
    @WebMethod
    @WebResult(name = "LoginReturn", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
    public String login(
        @WebParam(name = "Login", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
                LoginRequest param,
        @WebParam(name = "Context", targetNamespace = "http://www.informatica.com/wsh", header = true, mode = WebParam.Mode.OUT, partName = "Context")
        Holder<SessionHeader> context)
        throws Fault
    ;

    /**
     * 
     * @param param
     * @param context
     * @return
     *     returns com.informatica.wsh.type.VoidResponse
     * @throws Fault
     */
    @WebMethod
    @WebResult(name = "LogoutReturn", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
    public VoidResponse logout(
        @WebParam(name = "Logout", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
        VoidRequest param,
        @WebParam(name = "Context", targetNamespace = "http://www.informatica.com/wsh", header = true, partName = "Context")
        SessionHeader context)
        throws Fault
    ;

    /**
     * 
     * @param param
     * @param context
     * @return
     *     returns com.informatica.wsh.type.FolderInfoArray
     * @throws Fault
     */
    @WebMethod
    @WebResult(name = "GetAllFoldersReturn", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
    public FolderInfoArray getAllFolders(
        @WebParam(name = "GetAllFolders", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
        VoidRequest param,
        @WebParam(name = "Context", targetNamespace = "http://www.informatica.com/wsh", header = true, partName = "Context")
        SessionHeader context)
        throws Fault
    ;

    /**
     * 
     * @param param
     * @param context
     * @return
     *     returns com.informatica.wsh.type.WorkflowInfoArray
     * @throws Fault
     */
    @WebMethod
    @WebResult(name = "GetAllWorkflowsReturn", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
    public WorkflowInfoArray getAllWorkflows(
        @WebParam(name = "GetAllWorkflows", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
                FolderInfo param,
        @WebParam(name = "Context", targetNamespace = "http://www.informatica.com/wsh", header = true, partName = "Context")
        SessionHeader context)
        throws Fault
    ;

    /**
     * 
     * @param param
     * @param context
     * @return
     *     returns com.informatica.wsh.type.TaskInstanceInfoArray
     * @throws Fault
     */
    @WebMethod
    @WebResult(name = "GetAllTaskInstancesReturn", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
    public TaskInstanceInfoArray getAllTaskInstances(
        @WebParam(name = "GetAllTaskInstances", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
                GetAllTaskInstancesRequest param,
        @WebParam(name = "Context", targetNamespace = "http://www.informatica.com/wsh", header = true, partName = "Context")
        SessionHeader context)
        throws Fault
    ;

    /**
     * 
     * @param param
     * @param context
     * @return
     *     returns com.informatica.wsh.type.DIServerInfoArray
     * @throws Fault
     */
    @WebMethod
    @WebResult(name = "GetAllDIServersReturn", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
    public DIServerInfoArray getAllDIServers(
        @WebParam(name = "GetAllDIServers", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
        VoidRequest param,
        @WebParam(name = "Context", targetNamespace = "http://www.informatica.com/wsh", header = true, partName = "Context")
        SessionHeader context)
        throws Fault
    ;

    /**
     * 
     * @param param
     * @return
     *     returns com.informatica.wsh.type.RepositoryInfoArray
     * @throws Fault
     */
    @WebMethod
    @WebResult(name = "GetAllRepositoriesReturn", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
    public RepositoryInfoArray getAllRepositories(
        @WebParam(name = "GetAllRepositories", targetNamespace = "http://www.informatica.com/wsh", partName = "param")
        VoidRequest param)
        throws Fault
    ;

}
