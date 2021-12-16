
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DIServerDate complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DIServerDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NanoSeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Seconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Minutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Hours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UTCTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIServerDate", propOrder = {
    "date",
    "nanoSeconds",
    "seconds",
    "minutes",
    "hours",
    "month",
    "year",
    "utcTime"
})
public class DIServerDate {

    @XmlElement(name = "Date")
    protected int date;
    @XmlElement(name = "NanoSeconds")
    protected int nanoSeconds;
    @XmlElement(name = "Seconds")
    protected int seconds;
    @XmlElement(name = "Minutes")
    protected int minutes;
    @XmlElement(name = "Hours")
    protected int hours;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "UTCTime")
    protected int utcTime;

    /**
     * 获取date属性的值。
     * 
     */
    public int getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     */
    public void setDate(int value) {
        this.date = value;
    }

    /**
     * 获取nanoSeconds属性的值。
     * 
     */
    public int getNanoSeconds() {
        return nanoSeconds;
    }

    /**
     * 设置nanoSeconds属性的值。
     * 
     */
    public void setNanoSeconds(int value) {
        this.nanoSeconds = value;
    }

    /**
     * 获取seconds属性的值。
     * 
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * 设置seconds属性的值。
     * 
     */
    public void setSeconds(int value) {
        this.seconds = value;
    }

    /**
     * 获取minutes属性的值。
     * 
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * 设置minutes属性的值。
     * 
     */
    public void setMinutes(int value) {
        this.minutes = value;
    }

    /**
     * 获取hours属性的值。
     * 
     */
    public int getHours() {
        return hours;
    }

    /**
     * 设置hours属性的值。
     * 
     */
    public void setHours(int value) {
        this.hours = value;
    }

    /**
     * 获取month属性的值。
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * 设置month属性的值。
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * 获取year属性的值。
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * 设置year属性的值。
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * 获取utcTime属性的值。
     * 
     */
    public int getUTCTime() {
        return utcTime;
    }

    /**
     * 设置utcTime属性的值。
     * 
     */
    public void setUTCTime(int value) {
        this.utcTime = value;
    }

}
