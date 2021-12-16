
package com.informatica.wsh.type;

import com.informatica.wsh.enums.EDIServerRunStatus;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>DIServerDetails complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DIServerDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIServerStatus" type="{http://www.informatica.com/wsh}EDIServerRunStatus"/>
 *         &lt;element name="CurrentTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="StartupTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="ReferenceTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="WorkflowDetails" type="{http://www.informatica.com/wsh}WorkflowDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinkDetails" type="{http://www.informatica.com/wsh}LinkDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaskDetails" type="{http://www.informatica.com/wsh}TaskDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIServerDetails", propOrder = {
    "diServerStatus",
    "currentTime",
    "startupTime",
    "referenceTime",
    "workflowDetails",
    "linkDetails",
    "taskDetails"
})
public class DIServerDetails {

    @XmlElement(name = "DIServerStatus", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EDIServerRunStatus diServerStatus;
    @XmlElement(name = "CurrentTime", required = true, nillable = true)
    protected DIServerDate currentTime;
    @XmlElement(name = "StartupTime", required = true, nillable = true)
    protected DIServerDate startupTime;
    @XmlElement(name = "ReferenceTime", required = true, nillable = true)
    protected DIServerDate referenceTime;
    @XmlElement(name = "WorkflowDetails")
    protected List<WorkflowDetails> workflowDetails;
    @XmlElement(name = "LinkDetails")
    protected List<LinkDetails> linkDetails;
    @XmlElement(name = "TaskDetails")
    protected List<TaskDetails> taskDetails;

    /**
     * 获取diServerStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EDIServerRunStatus }
     *     
     */
    public EDIServerRunStatus getDIServerStatus() {
        return diServerStatus;
    }

    /**
     * 设置diServerStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EDIServerRunStatus }
     *     
     */
    public void setDIServerStatus(EDIServerRunStatus value) {
        this.diServerStatus = value;
    }

    /**
     * 获取currentTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getCurrentTime() {
        return currentTime;
    }

    /**
     * 设置currentTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setCurrentTime(DIServerDate value) {
        this.currentTime = value;
    }

    /**
     * 获取startupTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getStartupTime() {
        return startupTime;
    }

    /**
     * 设置startupTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setStartupTime(DIServerDate value) {
        this.startupTime = value;
    }

    /**
     * 获取referenceTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DIServerDate }
     *     
     */
    public DIServerDate getReferenceTime() {
        return referenceTime;
    }

    /**
     * 设置referenceTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DIServerDate }
     *     
     */
    public void setReferenceTime(DIServerDate value) {
        this.referenceTime = value;
    }

    /**
     * Gets the value of the workflowDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowDetails }
     * 
     * 
     */
    public List<WorkflowDetails> getWorkflowDetails() {
        if (workflowDetails == null) {
            workflowDetails = new ArrayList<WorkflowDetails>();
        }
        return this.workflowDetails;
    }

    /**
     * Gets the value of the linkDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkDetails }
     * 
     * 
     */
    public List<LinkDetails> getLinkDetails() {
        if (linkDetails == null) {
            linkDetails = new ArrayList<LinkDetails>();
        }
        return this.linkDetails;
    }

    /**
     * Gets the value of the taskDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskDetails }
     * 
     * 
     */
    public List<TaskDetails> getTaskDetails() {
        if (taskDetails == null) {
            taskDetails = new ArrayList<TaskDetails>();
        }
        return this.taskDetails;
    }

}
