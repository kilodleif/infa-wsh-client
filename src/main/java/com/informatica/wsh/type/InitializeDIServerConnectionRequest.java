
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InitializeDIServerConnectionRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InitializeDIServerConnectionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIServerDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeDIServerConnectionRequest", propOrder = {
    "loginHandle",
    "diServerName",
    "diServerDomain"
})
public class InitializeDIServerConnectionRequest {

    @XmlElement(name = "LoginHandle", required = true, nillable = true)
    protected String loginHandle;
    @XmlElement(name = "DIServerName", required = true)
    protected String diServerName;
    @XmlElement(name = "DIServerDomain", required = true, nillable = true)
    protected String diServerDomain;

    /**
     * 获取loginHandle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginHandle() {
        return loginHandle;
    }

    /**
     * 设置loginHandle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginHandle(String value) {
        this.loginHandle = value;
    }

    /**
     * 获取diServerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIServerName() {
        return diServerName;
    }

    /**
     * 设置diServerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIServerName(String value) {
        this.diServerName = value;
    }

    /**
     * 获取diServerDomain属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIServerDomain() {
        return diServerDomain;
    }

    /**
     * 设置diServerDomain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIServerDomain(String value) {
        this.diServerDomain = value;
    }

}
