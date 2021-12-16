
package com.informatica.wsh.type;

import com.informatica.wsh.enums.ETaskRunStatus;
import com.informatica.wsh.enums.ETaskType;
import com.informatica.wsh.type.Attribute;
import com.informatica.wsh.type.DIServerDate;
import com.informatica.wsh.type.DIServiceInfo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>TaskDetails complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaskDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskRunStatus" type="{http://www.informatica.com/wsh}ETaskRunStatus"/>
 *         &lt;element name="TaskType" type="{http://www.informatica.com/wsh}ETaskType"/>
 *         &lt;element name="RunErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RunErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="EndTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="WorkletInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attribute" type="{http://www.informatica.com/wsh}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsSessionTask" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WorkletRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskDetails", propOrder = {
    "diServiceInfo",
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "taskRunStatus",
    "taskType",
    "runErrorCode",
    "runErrorMessage",
    "startTime",
    "endTime",
    "workletInstanceName",
    "attribute",
    "childRunId",
    "instanceName",
    "isSessionTask",
    "workletRunId"
})
public class TaskDetails {

    @XmlElement(name = "DIServiceInfo", required = true, nillable = true)
    protected DIServiceInfo diServiceInfo;
    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkflowRunId")
    protected int workflowRunId;
    @XmlElement(name = "WorkflowRunInstanceName", required = true, nillable = true)
    protected String workflowRunInstanceName;
    @XmlElement(name = "TaskRunStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskRunStatus taskRunStatus;
    @XmlElement(name = "TaskType", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskType taskType;
    @XmlElement(name = "RunErrorCode")
    protected int runErrorCode;
    @XmlElement(name = "RunErrorMessage", required = true, nillable = true)
    protected String runErrorMessage;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    protected DIServerDate startTime;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    protected DIServerDate endTime;
    @XmlElement(name = "WorkletInstanceName", required = true, nillable = true)
    protected String workletInstanceName;
    @XmlElement(name = "Attribute")
    protected List<Attribute> attribute;
    @XmlElement(name = "ChildRunId")
    protected int childRunId;
    @XmlElement(name = "InstanceName", required = true, nillable = true)
    protected String instanceName;
    @XmlElement(name = "IsSessionTask")
    protected boolean isSessionTask;
    @XmlElement(name = "WorkletRunId")
    protected int workletRunId;

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
     */
    public int getWorkflowRunId() {
        return workflowRunId;
    }

    /**
     * 设置workflowRunId属性的值。
     * 
     */
    public void setWorkflowRunId(int value) {
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
     * 获取taskRunStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ETaskRunStatus }
     *     
     */
    public ETaskRunStatus getTaskRunStatus() {
        return taskRunStatus;
    }

    /**
     * 设置taskRunStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ETaskRunStatus }
     *     
     */
    public void setTaskRunStatus(ETaskRunStatus value) {
        this.taskRunStatus = value;
    }

    /**
     * 获取taskType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ETaskType }
     *     
     */
    public ETaskType getTaskType() {
        return taskType;
    }

    /**
     * 设置taskType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ETaskType }
     *     
     */
    public void setTaskType(ETaskType value) {
        this.taskType = value;
    }

    /**
     * 获取runErrorCode属性的值。
     * 
     */
    public int getRunErrorCode() {
        return runErrorCode;
    }

    /**
     * 设置runErrorCode属性的值。
     * 
     */
    public void setRunErrorCode(int value) {
        this.runErrorCode = value;
    }

    /**
     * 获取runErrorMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunErrorMessage() {
        return runErrorMessage;
    }

    /**
     * 设置runErrorMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunErrorMessage(String value) {
        this.runErrorMessage = value;
    }

    /**
     * 获取startTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getStartTime() {
        return startTime;
    }

    /**
     * 设置startTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setStartTime(DIServerDate value) {
        this.startTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setEndTime(DIServerDate value) {
        this.endTime = value;
    }

    /**
     * 获取workletInstanceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkletInstanceName() {
        return workletInstanceName;
    }

    /**
     * 设置workletInstanceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkletInstanceName(String value) {
        this.workletInstanceName = value;
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
     * 获取childRunId属性的值。
     * 
     */
    public int getChildRunId() {
        return childRunId;
    }

    /**
     * 设置childRunId属性的值。
     * 
     */
    public void setChildRunId(int value) {
        this.childRunId = value;
    }

    /**
     * 获取instanceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * 设置instanceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

    /**
     * 获取isSessionTask属性的值。
     * 
     */
    public boolean isIsSessionTask() {
        return isSessionTask;
    }

    /**
     * 设置isSessionTask属性的值。
     * 
     */
    public void setIsSessionTask(boolean value) {
        this.isSessionTask = value;
    }

    /**
     * 获取workletRunId属性的值。
     * 
     */
    public int getWorkletRunId() {
        return workletRunId;
    }

    /**
     * 设置workletRunId属性的值。
     * 
     */
    public void setWorkletRunId(int value) {
        this.workletRunId = value;
    }

}
