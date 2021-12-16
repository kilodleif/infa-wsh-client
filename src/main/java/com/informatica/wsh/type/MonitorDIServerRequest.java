
package com.informatica.wsh.type;

import com.informatica.wsh.enums.EDIServerMonitorMode;

import javax.xml.bind.annotation.*;


/**
 * <p>MonitorDIServerRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MonitorDIServerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIServiceInfo" type="{http://www.informatica.com/wsh}DIServiceInfo"/>
 *         &lt;element name="MonitorMode" type="{http://www.informatica.com/wsh}EDIServerMonitorMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitorDIServerRequest", propOrder = {
    "diServiceInfo",
    "monitorMode"
})
public class MonitorDIServerRequest {

    @XmlElement(name = "DIServiceInfo", required = true, nillable = true)
    protected DIServiceInfo diServiceInfo;
    @XmlElement(name = "MonitorMode", required = true)
    @XmlSchemaType(name = "token")
    protected EDIServerMonitorMode monitorMode;

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
     * 获取monitorMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EDIServerMonitorMode }
     *     
     */
    public EDIServerMonitorMode getMonitorMode() {
        return monitorMode;
    }

    /**
     * 设置monitorMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EDIServerMonitorMode }
     *     
     */
    public void setMonitorMode(EDIServerMonitorMode value) {
        this.monitorMode = value;
    }

}
