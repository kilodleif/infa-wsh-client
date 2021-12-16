
package com.informatica.wsh.type;

import com.informatica.wsh.enums.EWorkflowRunStatus;
import com.informatica.wsh.enums.EWorkflowRunType;
import com.informatica.wsh.type.Attribute;
import com.informatica.wsh.type.DIServerDate;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WorkflowDetails complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WorkflowDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowRunStatus" type="{http://www.informatica.com/wsh}EWorkflowRunStatus"/>
 *         &lt;element name="WorkflowRunType" type="{http://www.informatica.com/wsh}EWorkflowRunType"/>
 *         &lt;element name="RunErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RunErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="EndTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="Attribute" type="{http://www.informatica.com/wsh}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LogFileCodePage" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "WorkflowDetails", propOrder = {
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "workflowRunStatus",
    "workflowRunType",
    "runErrorCode",
    "runErrorMessage",
    "startTime",
    "endTime",
    "attribute",
    "userName",
    "logFileName",
    "logFileCodePage",
    "osUser"
})
public class WorkflowDetails {

    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkflowRunId")
    protected int workflowRunId;
    @XmlElement(name = "WorkflowRunInstanceName", required = true, nillable = true)
    protected String workflowRunInstanceName;
    @XmlElement(name = "WorkflowRunStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EWorkflowRunStatus workflowRunStatus;
    @XmlElement(name = "WorkflowRunType", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EWorkflowRunType workflowRunType;
    @XmlElement(name = "RunErrorCode")
    protected int runErrorCode;
    @XmlElement(name = "RunErrorMessage", required = true, nillable = true)
    protected String runErrorMessage;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    protected DIServerDate startTime;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    protected DIServerDate endTime;
    @XmlElement(name = "Attribute")
    protected List<Attribute> attribute;
    @XmlElement(name = "UserName", required = true, nillable = true)
    protected String userName;
    @XmlElement(name = "LogFileName", required = true, nillable = true)
    protected String logFileName;
    @XmlElement(name = "LogFileCodePage")
    protected int logFileCodePage;
    @XmlElement(name = "OSUser", required = true, nillable = true)
    protected String osUser;

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
     * 获取workflowRunStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EWorkflowRunStatus }
     *     
     */
    public EWorkflowRunStatus getWorkflowRunStatus() {
        return workflowRunStatus;
    }

    /**
     * 设置workflowRunStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EWorkflowRunStatus }
     *     
     */
    public void setWorkflowRunStatus(EWorkflowRunStatus value) {
        this.workflowRunStatus = value;
    }

    /**
     * 获取workflowRunType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EWorkflowRunType }
     *     
     */
    public EWorkflowRunType getWorkflowRunType() {
        return workflowRunType;
    }

    /**
     * 设置workflowRunType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EWorkflowRunType }
     *     
     */
    public void setWorkflowRunType(EWorkflowRunType value) {
        this.workflowRunType = value;
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
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取logFileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogFileName() {
        return logFileName;
    }

    /**
     * 设置logFileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogFileName(String value) {
        this.logFileName = value;
    }

    /**
     * 获取logFileCodePage属性的值。
     * 
     */
    public int getLogFileCodePage() {
        return logFileCodePage;
    }

    /**
     * 设置logFileCodePage属性的值。
     * 
     */
    public void setLogFileCodePage(int value) {
        this.logFileCodePage = value;
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
