
package com.informatica.wsh.type;

import com.informatica.wsh.enums.ETaskRunMode;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkflowRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute" type="{http://www.informatica.com/wsh}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Key" type="{http://www.informatica.com/wsh}Key" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParameterFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parameters" type="{http://www.informatica.com/wsh}ParameterArray"/>
 *         &lt;element name="RequestMode" type="{http://www.informatica.com/wsh}ETaskRunMode"/>
 *         &lt;element name="TaskInstancePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsAbort" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OSUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequest", propOrder = {
    "diServiceInfo",
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "reason",
    "attribute",
    "key",
    "parameterFileName",
    "parameters",
    "requestMode",
    "taskInstancePath",
    "isAbort",
    "osUser"
})
public class WorkflowRequest {

    @XmlElement(name = "DIServiceInfo", required = true, nillable = true)
    protected DIServiceInfo diServiceInfo;
    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkflowRunId", required = true, type = Integer.class, nillable = true)
    protected Integer workflowRunId;
    @XmlElement(name = "WorkflowRunInstanceName", required = true, nillable = true)
    protected String workflowRunInstanceName;
    @XmlElement(name = "Reason", required = true, nillable = true)
    protected String reason;
    @XmlElement(name = "Attribute")
    protected List<Attribute> attribute;
    @XmlElement(name = "Key")
    protected List<Key> key;
    @XmlElement(name = "ParameterFileName", required = true, nillable = true)
    protected String parameterFileName;
    @XmlElement(name = "Parameters", required = true, nillable = true)
    protected ParameterArray parameters;
    @XmlElement(name = "RequestMode", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskRunMode requestMode;
    @XmlElement(name = "TaskInstancePath", required = true, nillable = true)
    protected String taskInstancePath;
    @XmlElement(name = "IsAbort")
    protected boolean isAbort;
    @XmlElement(name = "OSUser", required = true, nillable = true)
    protected String osUser;

    /**
     * 获取diServiceInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DIServiceInfo }
     *     
     */
    public DIServiceInfo getDIServiceInfo() {
        return diServiceInfo;
    }

    /**
     * 设置diServiceInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DIServiceInfo }
     *     
     */
    public void setDIServiceInfo(DIServiceInfo value) {
        this.diServiceInfo = value;
    }

    /**
     * 获取folderName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * 设置folderName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

    /**
     * 获取workflowName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * 设置workflowName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowName(String value) {
        this.workflowName = value;
    }

    /**
     * 获取workflowRunId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkflowRunId() {
        return workflowRunId;
    }

    /**
     * 设置workflowRunId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkflowRunId(Integer value) {
        this.workflowRunId = value;
    }

    /**
     * 获取workflowRunInstanceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowRunInstanceName() {
        return workflowRunInstanceName;
    }

    /**
     * 设置workflowRunInstanceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowRunInstanceName(String value) {
        this.workflowRunInstanceName = value;
    }

    /**
     * 获取reason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置reason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<Attribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Key }
     * 
     * 
     */
    public List<Key> getKey() {
        if (key == null) {
            key = new ArrayList<Key>();
        }
        return this.key;
    }

    /**
     * 获取parameterFileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterFileName() {
        return parameterFileName;
    }

    /**
     * 设置parameterFileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterFileName(String value) {
        this.parameterFileName = value;
    }

    /**
     * 获取parameters属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ParameterArray }
     *     
     */
    public ParameterArray getParameters() {
        return parameters;
    }

    /**
     * 设置parameters属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterArray }
     *     
     */
    public void setParameters(ParameterArray value) {
        this.parameters = value;
    }

    /**
     * 获取requestMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ETaskRunMode }
     *     
     */
    public ETaskRunMode getRequestMode() {
        return requestMode;
    }

    /**
     * 设置requestMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ETaskRunMode }
     *     
     */
    public void setRequestMode(ETaskRunMode value) {
        this.requestMode = value;
    }

    /**
     * 获取taskInstancePath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInstancePath() {
        return taskInstancePath;
    }

    /**
     * 设置taskInstancePath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInstancePath(String value) {
        this.taskInstancePath = value;
    }

    /**
     * 获取isAbort属性的值。
     * 
     */
    public boolean isIsAbort() {
        return isAbort;
    }

    /**
     * 设置isAbort属性的值。
     * 
     */
    public void setIsAbort(boolean value) {
        this.isAbort = value;
    }

    /**
     * 获取osUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSUser() {
        return osUser;
    }

    /**
     * 设置osUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSUser(String value) {
        this.osUser = value;
    }

}
