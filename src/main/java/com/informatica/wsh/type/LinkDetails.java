
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LinkDetails complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LinkDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkletInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromTaskInstanceDetails" type="{http://www.informatica.com/wsh}TaskDetails"/>
 *         &lt;element name="ToTaskInstanceDetails" type="{http://www.informatica.com/wsh}TaskDetails"/>
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "LinkDetails", propOrder = {
    "folderName",
    "workflowName",
    "workletInstanceName",
    "fromTaskInstanceDetails",
    "toTaskInstanceDetails",
    "workflowRunId",
    "workletRunId"
})
public class LinkDetails {

    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "WorkletInstanceName", required = true, nillable = true)
    protected String workletInstanceName;
    @XmlElement(name = "FromTaskInstanceDetails", required = true, nillable = true)
    protected TaskDetails fromTaskInstanceDetails;
    @XmlElement(name = "ToTaskInstanceDetails", required = true, nillable = true)
    protected TaskDetails toTaskInstanceDetails;
    @XmlElement(name = "WorkflowRunId")
    protected int workflowRunId;
    @XmlElement(name = "WorkletRunId")
    protected int workletRunId;

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
     * 获取fromTaskInstanceDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaskDetails }
     *     
     */
    public TaskDetails getFromTaskInstanceDetails() {
        return fromTaskInstanceDetails;
    }

    /**
     * 设置fromTaskInstanceDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDetails }
     *     
     */
    public void setFromTaskInstanceDetails(TaskDetails value) {
        this.fromTaskInstanceDetails = value;
    }

    /**
     * 获取toTaskInstanceDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaskDetails }
     *     
     */
    public TaskDetails getToTaskInstanceDetails() {
        return toTaskInstanceDetails;
    }

    /**
     * 设置toTaskInstanceDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDetails }
     *     
     */
    public void setToTaskInstanceDetails(TaskDetails value) {
        this.toTaskInstanceDetails = value;
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
