
package com.informatica.wsh.type;

import com.informatica.wsh.enums.ETaskRunStatus;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>SessionPerformanceData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SessionPerformanceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskRunStatus" type="{http://www.informatica.com/wsh}ETaskRunStatus"/>
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkletRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PerformanceCounter" type="{http://www.informatica.com/wsh}PerformanceCounter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionPerformanceData", propOrder = {
    "folderName",
    "workflowName",
    "instanceName",
    "taskRunStatus",
    "workflowRunId",
    "workletRunId",
    "workflowRunInstanceName",
    "performanceCounter"
})
public class SessionPerformanceData {

    @XmlElement(name = "FolderName", required = true, nillable = true)
    protected String folderName;
    @XmlElement(name = "WorkflowName", required = true, nillable = true)
    protected String workflowName;
    @XmlElement(name = "InstanceName", required = true, nillable = true)
    protected String instanceName;
    @XmlElement(name = "TaskRunStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected ETaskRunStatus taskRunStatus;
    @XmlElement(name = "WorkflowRunId")
    protected int workflowRunId;
    @XmlElement(name = "WorkletRunId")
    protected int workletRunId;
    @XmlElement(name = "WorkflowRunInstanceName", required = true)
    protected String workflowRunInstanceName;
    @XmlElement(name = "PerformanceCounter")
    protected List<PerformanceCounter> performanceCounter;

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
     * Gets the value of the performanceCounter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceCounter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceCounter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceCounter }
     * 
     * 
     */
    public List<PerformanceCounter> getPerformanceCounter() {
        if (performanceCounter == null) {
            performanceCounter = new ArrayList<PerformanceCounter>();
        }
        return this.performanceCounter;
    }

}
