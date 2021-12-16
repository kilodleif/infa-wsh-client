
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetNextLogSegmentRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetNextLogSegmentRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogHandle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNextLogSegmentRequest", propOrder = {
    "logHandle",
    "timeOut"
})
public class GetNextLogSegmentRequest {

    @XmlElement(name = "LogHandle")
    protected int logHandle;
    @XmlElement(name = "TimeOut")
    protected int timeOut;

    /**
     * 获取logHandle属性的值。
     * 
     */
    public int getLogHandle() {
        return logHandle;
    }

    /**
     * 设置logHandle属性的值。
     * 
     */
    public void setLogHandle(int value) {
        this.logHandle = value;
    }

    /**
     * 获取timeOut属性的值。
     * 
     */
    public int getTimeOut() {
        return timeOut;
    }

    /**
     * 设置timeOut属性的值。
     * 
     */
    public void setTimeOut(int value) {
        this.timeOut = value;
    }

}
