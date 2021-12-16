
package com.informatica.wsh.type;

import com.informatica.wsh.type.DIServerDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TableStatistics complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TableStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WidgetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WidgetType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WidgetInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="EndTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="NumAppliedRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumAffectedRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumRejectedRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Throughput" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PartitionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableStatistics", propOrder = {
    "widgetName",
    "widgetType",
    "widgetInstanceName",
    "lastErrorCode",
    "lastErrorMessage",
    "startTime",
    "endTime",
    "numAppliedRows",
    "numAffectedRows",
    "numRejectedRows",
    "throughput",
    "partitionName",
    "groupName"
})
public class TableStatistics {

    @XmlElement(name = "WidgetName", required = true, nillable = true)
    protected String widgetName;
    @XmlElement(name = "WidgetType", required = true, nillable = true)
    protected String widgetType;
    @XmlElement(name = "WidgetInstanceName", required = true, nillable = true)
    protected String widgetInstanceName;
    @XmlElement(name = "LastErrorCode")
    protected int lastErrorCode;
    @XmlElement(name = "LastErrorMessage", required = true, nillable = true)
    protected String lastErrorMessage;
    @XmlElement(name = "StartTime", required = true, nillable = true)
    protected DIServerDate startTime;
    @XmlElement(name = "EndTime", required = true, nillable = true)
    protected DIServerDate endTime;
    @XmlElement(name = "NumAppliedRows")
    protected int numAppliedRows;
    @XmlElement(name = "NumAffectedRows")
    protected int numAffectedRows;
    @XmlElement(name = "NumRejectedRows")
    protected int numRejectedRows;
    @XmlElement(name = "Throughput")
    protected int throughput;
    @XmlElement(name = "PartitionName", required = true, nillable = true)
    protected String partitionName;
    @XmlElement(name = "GroupName", required = true, nillable = true)
    protected String groupName;

    /**
     * 获取widgetName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetName() {
        return widgetName;
    }

    /**
     * 设置widgetName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetName(String value) {
        this.widgetName = value;
    }

    /**
     * 获取widgetType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetType() {
        return widgetType;
    }

    /**
     * 设置widgetType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetType(String value) {
        this.widgetType = value;
    }

    /**
     * 获取widgetInstanceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidgetInstanceName() {
        return widgetInstanceName;
    }

    /**
     * 设置widgetInstanceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidgetInstanceName(String value) {
        this.widgetInstanceName = value;
    }

    /**
     * 获取lastErrorCode属性的值。
     * 
     */
    public int getLastErrorCode() {
        return lastErrorCode;
    }

    /**
     * 设置lastErrorCode属性的值。
     * 
     */
    public void setLastErrorCode(int value) {
        this.lastErrorCode = value;
    }

    /**
     * 获取lastErrorMessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    /**
     * 设置lastErrorMessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastErrorMessage(String value) {
        this.lastErrorMessage = value;
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
     * 获取numAppliedRows属性的值。
     * 
     */
    public int getNumAppliedRows() {
        return numAppliedRows;
    }

    /**
     * 设置numAppliedRows属性的值。
     * 
     */
    public void setNumAppliedRows(int value) {
        this.numAppliedRows = value;
    }

    /**
     * 获取numAffectedRows属性的值。
     * 
     */
    public int getNumAffectedRows() {
        return numAffectedRows;
    }

    /**
     * 设置numAffectedRows属性的值。
     * 
     */
    public void setNumAffectedRows(int value) {
        this.numAffectedRows = value;
    }

    /**
     * 获取numRejectedRows属性的值。
     * 
     */
    public int getNumRejectedRows() {
        return numRejectedRows;
    }

    /**
     * 设置numRejectedRows属性的值。
     * 
     */
    public void setNumRejectedRows(int value) {
        this.numRejectedRows = value;
    }

    /**
     * 获取throughput属性的值。
     * 
     */
    public int getThroughput() {
        return throughput;
    }

    /**
     * 设置throughput属性的值。
     * 
     */
    public void setThroughput(int value) {
        this.throughput = value;
    }

    /**
     * 获取partitionName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartitionName() {
        return partitionName;
    }

    /**
     * 设置partitionName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartitionName(String value) {
        this.partitionName = value;
    }

    /**
     * 获取groupName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置groupName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

}
