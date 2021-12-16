
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LoginRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LoginRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RepositoryDomainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RepositoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserNameSpace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginRequest", propOrder = {
    "repositoryDomainName",
    "repositoryName",
    "userName",
    "password",
    "userNameSpace"
})
public class LoginRequest {

    @XmlElement(name = "RepositoryDomainName", required = true, nillable = true)
    protected String repositoryDomainName;
    @XmlElement(name = "RepositoryName", required = true)
    protected String repositoryName;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "UserNameSpace", required = true, nillable = true)
    protected String userNameSpace;

    /**
     * 获取repositoryDomainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryDomainName() {
        return repositoryDomainName;
    }

    /**
     * 设置repositoryDomainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryDomainName(String value) {
        this.repositoryDomainName = value;
    }

    /**
     * 获取repositoryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    /**
     * 设置repositoryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepositoryName(String value) {
        this.repositoryName = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取userNameSpace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameSpace() {
        return userNameSpace;
    }

    /**
     * 设置userNameSpace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameSpace(String value) {
        this.userNameSpace = value;
    }

}
