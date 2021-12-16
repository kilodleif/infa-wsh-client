
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TaskTopLevelParent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaskTopLevelParent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TaskInstanceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TaskInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TopLevelParentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TopLevelParentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskTopLevelParent", propOrder = {
    "folderId",
    "folderName",
    "workflowId",
    "workflowName",
    "taskInstanceId",
    "taskInstanceName",
    "topLevelParentId",
    "topLevelParentName"
})
public class TaskTopLevelParent {

    @XmlElement(name = "FolderId")
    protected int folderId;
    @XmlElement(name = "FolderName", required = true)
    protected String folderName;
    @XmlElement(name = "WorkflowId")
    protected int workflowId;
    @XmlElement(name = "WorkflowName", required = true)
    protected String workflowName;
    @XmlElement(name = "TaskInstanceId")
    protected int taskInstanceId;
    @XmlElement(name = "TaskInstanceName", required = true)
    protected String taskInstanceName;
    @XmlElement(name = "TopLevelParentId")
    protected int topLevelParentId;
    @XmlElement(name = "TopLevelParentName", required = true)
    protected String topLevelParentName;

    /**
     * 获取folderId属性的值。
     * 
     */
    public int getFolderId() {
        return folderId;
    }

    /**
     * 设置folderId属性的值。
     * 
     */
    public void setFolderId(int value) {
        this.folderId = value;
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
     * 获取workflowId属性的值。
     * 
     */
    public int getWorkflowId() {
        return workflowId;
    }

    /**
     * 设置workflowId属性的值。
     * 
     */
    public void setWorkflowId(int value) {
        this.workflowId = value;
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
     * 获取taskInstanceId属性的值。
     * 
     */
    public int getTaskInstanceId() {
        return taskInstanceId;
    }

    /**
     * 设置taskInstanceId属性的值。
     * 
     */
    public void setTaskInstanceId(int value) {
        this.taskInstanceId = value;
    }

    /**
     * 获取taskInstanceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInstanceName() {
        return taskInstanceName;
    }

    /**
     * 设置taskInstanceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInstanceName(String value) {
        this.taskInstanceName = value;
    }

    /**
     * 获取topLevelParentId属性的值。
     * 
     */
    public int getTopLevelParentId() {
        return topLevelParentId;
    }

    /**
     * 设置topLevelParentId属性的值。
     * 
     */
    public void setTopLevelParentId(int value) {
        this.topLevelParentId = value;
    }

    /**
     * 获取topLevelParentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopLevelParentName() {
        return topLevelParentName;
    }

    /**
     * 设置topLevelParentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopLevelParentName(String value) {
        this.topLevelParentName = value;
    }

}
