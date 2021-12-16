
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetWorkflowLogRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetWorkflowLogRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/>
 *         &lt;element name="FolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WorkflowRunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkflowRunInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWorkflowLogRequest", propOrder = {
    "diServiceInfo",
    "folderName",
    "workflowName",
    "workflowRunId",
    "workflowRunInstanceName",
    "timeout"
})
public class GetWorkflowLogRequest {

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
    @XmlElement(name = "Timeout")
    protected int timeout;

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
     * 获取timeout属性的值。
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * 设置timeout属性的值。
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

}
