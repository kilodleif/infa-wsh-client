
package com.informatica.wsh.type;

import com.informatica.wsh.enums.EDIServerMode;

import javax.xml.bind.annotation.*;


/**
 * <p>DIServerProperties complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DIServerProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DIServerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Repositoryname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CanInfaServerDebugMapping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DIServerMode" type="{http://www.informatica.com/wsh}EDIServerMode"/>
 *         &lt;element name="DIServerVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrentTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="StartupTime" type="{http://www.informatica.com/wsh}DIServerDate"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIServerProperties", propOrder = {
    "diServerName",
    "repositoryname",
    "canInfaServerDebugMapping",
    "diServerMode",
    "diServerVersion",
    "currentTime",
    "startupTime",
    "productName"
})
public class DIServerProperties {

    @XmlElement(name = "DIServerName", required = true, nillable = true)
    protected String diServerName;
    @XmlElement(name = "Repositoryname", required = true, nillable = true)
    protected String repositoryname;
    @XmlElement(name = "CanInfaServerDebugMapping")
    protected boolean canInfaServerDebugMapping;
    @XmlElement(name = "DIServerMode", required = true, nillable = true)
    @XmlSchemaType(name = "token")
    protected EDIServerMode diServerMode;
    @XmlElement(name = "DIServerVersion", required = true, nillable = true)
    protected String diServerVersion;
    @XmlElement(name = "CurrentTime", required = true, nillable = true)
    protected DIServerDate currentTime;
    @XmlElement(name = "StartupTime", required = true, nillable = true)
    protected DIServerDate startupTime;
    @XmlElement(name = "ProductName", required = true, nillable = true)
    protected String productName;

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
     * 获取repositoryname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryname() {
        return repositoryname;
    }

    /**
     * 设置repositoryname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryname(String value) {
        this.repositoryname = value;
    }

    /**
     * 获取canInfaServerDebugMapping属性的值。
     * 
     */
    public boolean isCanInfaServerDebugMapping() {
        return canInfaServerDebugMapping;
    }

    /**
     * 设置canInfaServerDebugMapping属性的值。
     * 
     */
    public void setCanInfaServerDebugMapping(boolean value) {
        this.canInfaServerDebugMapping = value;
    }

    /**
     * 获取diServerMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EDIServerMode }
     *     
     */
    public EDIServerMode getDIServerMode() {
        return diServerMode;
    }

    /**
     * 设置diServerMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EDIServerMode }
     *     
     */
    public void setDIServerMode(EDIServerMode value) {
        this.diServerMode = value;
    }

    /**
     * 获取diServerVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIServerVersion() {
        return diServerVersion;
    }

    /**
     * 设置diServerVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIServerVersion(String value) {
        this.diServerVersion = value;
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
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

}
