
package com.informatica.wsh.type;

import com.informatica.wsh.enums.ETaskRunStatus;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SessionStatistics complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SessionStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MappingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskRunStatus" type="{http://www.informatica.com/wsh}ETaskRunStatus"/>
 *         &lt;element name="WorkletRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogFileCodePage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumSrcSuccessRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumTgtSuccessRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumSrcFailedRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumTgtFailedRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumTransErrors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumTables" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LogFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TableStatistics" type="{http://www.informatica.com/wsh}TableStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionStatistics", propOrder = {
    "diServiceInfo",
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "instanceName",
    "mappingName",
    "taskRunStatus",
    "workletRunId",
    "logFileCodePage",
    "numSrcSuccessRows",
    "numTgtSuccessRows",
    "numSrcFailedRows",
    "numTgtFailedRows",
    "numTransErrors",
    "numTables",
    "logFileName",
    "firstErrorCode",
    "firstErrorMessage",
    "tableStatistics"
})
public class SessionStatistics {

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
    @XmlElement(name = "InstanceName", required = true, nillable = true)
    protected String instanceName;
    @XmlElement(name = "MappingName", required = true, nillable = true)
    protected String mappingName;
    @XmlElement(name = "TaskRunStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskRunStatus taskRunStatus;
    @XmlElement(name = "WorkletRunId")
    protected int workletRunId;
    @XmlElement(name = "LogFileCodePage")
    protected int logFileCodePage;
    @XmlElement(name = "NumSrcSuccessRows")
    protected int numSrcSuccessRows;
    @XmlElement(name = "NumTgtSuccessRows")
    protected int numTgtSuccessRows;
    @XmlElement(name = "NumSrcFailedRows")
    protected int numSrcFailedRows;
    @XmlElement(name = "NumTgtFailedRows")
    protected int numTgtFailedRows;
    @XmlElement(name = "NumTransErrors")
    protected int numTransErrors;
    @XmlElement(name = "NumTables")
    protected int numTables;
    @XmlElement(name = "LogFileName", required = true, nillable = true)
    protected String logFileName;
    @XmlElement(name = "FirstErrorCode")
    protected int firstErrorCode;
    @XmlElement(name = "FirstErrorMessage", required = true, nillable = true)
    protected String firstErrorMessage;
    @XmlElement(name = "TableStatistics")
    protected List<TableStatistics> tableStatistics;

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
     * 获取mappingName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingName() {
        return mappingName;
    }

    /**
     * 设置mappingName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingName(String value) {
        this.mappingName = value;
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
     * 获取numSrcSuccessRows属性的值。
     * 
     */
    public int getNumSrcSuccessRows() {
        return numSrcSuccessRows;
    }

    /**
     * 设置numSrcSuccessRows属性的值。
     * 
     */
    public void setNumSrcSuccessRows(int value) {
        this.numSrcSuccessRows = value;
    }

    /**
     * 获取numTgtSuccessRows属性的值。
     * 
     */
    public int getNumTgtSuccessRows() {
        return numTgtSuccessRows;
    }

    /**
     * 设置numTgtSuccessRows属性的值。
     * 
     */
    public void setNumTgtSuccessRows(int value) {
        this.numTgtSuccessRows = value;
    }

    /**
     * 获取numSrcFailedRows属性的值。
     * 
     */
    public int getNumSrcFailedRows() {
        return numSrcFailedRows;
    }

    /**
     * 设置numSrcFailedRows属性的值。
     * 
     */
    public void setNumSrcFailedRows(int value) {
        this.numSrcFailedRows = value;
    }

    /**
     * 获取numTgtFailedRows属性的值。
     * 
     */
    public int getNumTgtFailedRows() {
        return numTgtFailedRows;
    }

    /**
     * 设置numTgtFailedRows属性的值。
     * 
     */
    public void setNumTgtFailedRows(int value) {
        this.numTgtFailedRows = value;
    }

    /**
     * 获取numTransErrors属性的值。
     * 
     */
    public int getNumTransErrors() {
        return numTransErrors;
    }

    /**
     * 设置numTransErrors属性的值。
     * 
     */
    public void setNumTransErrors(int value) {
        this.numTransErrors = value;
    }

    /**
     * 获取numTables属性的值。
     * 
     */
    public int getNumTables() {
        return numTables;
    }

    /**
     * 设置numTables属性的值。
     * 
     */
    public void setNumTables(int value) {
        this.numTables = value;
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
     * 获取firstErrorCode属性的值。
     * 
     */
    public int getFirstErrorCode() {
        return firstErrorCode;
    }

    /**
     * 设置firstErrorCode属性的值。
     * 
     */
    public void setFirstErrorCode(int value) {
        this.firstErrorCode = value;
    }

    /**
     * 获取firstErrorMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstErrorMessage() {
        return firstErrorMessage;
    }

    /**
     * 设置firstErrorMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstErrorMessage(String value) {
        this.firstErrorMessage = value;
    }

    /**
     * Gets the value of the tableStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableStatistics }
     * 
     * 
     */
    public List<TableStatistics> getTableStatistics() {
        if (tableStatistics == null) {
            tableStatistics = new ArrayList<TableStatistics>();
        }
        return this.tableStatistics;
    }

}
