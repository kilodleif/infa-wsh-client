
package com.informatica.wsh.type;

import com.informatica.wsh.enums.EPerformanceCounterType;

import javax.xml.bind.annotation.*;


/**
 * <p>PerformanceCounter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PerformanceCounter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CounterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CounterValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WidgetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CounterStringValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CounterType" type="{http://www.informatica.com/wsh}EPerformanceCounterType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceCounter", propOrder = {
    "counterName",
    "counterValue",
    "widgetName",
    "counterStringValue",
    "counterType"
})
public class PerformanceCounter {

    @XmlElement(name = "CounterName", required = true, nillable = true)
    protected String counterName;
    @XmlElement(name = "CounterValue")
    protected int counterValue;
    @XmlElement(name = "WidgetName", required = true, nillable = true)
    protected String widgetName;
    @XmlElement(name = "CounterStringValue", required = true, nillable = true)
    protected String counterStringValue;
    @XmlElement(name = "CounterType", required = true)
    @XmlSchemaType(name = "token")
    protected EPerformanceCounterType counterType;

    /**
     * 获取counterName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterName() {
        return counterName;
    }

    /**
     * 设置counterName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterName(String value) {
        this.counterName = value;
    }

    /**
     * 获取counterValue属性的值。
     * 
     */
    public int getCounterValue() {
        return counterValue;
    }

    /**
     * 设置counterValue属性的值。
     * 
     */
    public void setCounterValue(int value) {
        this.counterValue = value;
    }

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
     * 获取counterStringValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterStringValue() {
        return counterStringValue;
    }

    /**
     * 设置counterStringValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterStringValue(String value) {
        this.counterStringValue = value;
    }

    /**
     * 获取counterType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EPerformanceCounterType }
     *     
     */
    public EPerformanceCounterType getCounterType() {
        return counterType;
    }

    /**
     * 设置counterType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EPerformanceCounterType }
     *     
     */
    public void setCounterType(EPerformanceCounterType value) {
        this.counterType = value;
    }

}
