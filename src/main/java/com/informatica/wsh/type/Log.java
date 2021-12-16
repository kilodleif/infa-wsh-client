
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Log complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Log">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Buffer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodePage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Log", propOrder = {
    "fileSize",
    "buffer",
    "codePage"
})
public class Log {

    @XmlElement(name = "FileSize")
    protected int fileSize;
    @XmlElement(name = "Buffer", required = true, nillable = true)
    protected String buffer;
    @XmlElement(name = "CodePage")
    protected int codePage;

    /**
     * 获取fileSize属性的值。
     * 
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * 设置fileSize属性的值。
     * 
     */
    public void setFileSize(int value) {
        this.fileSize = value;
    }

    /**
     * 获取buffer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuffer() {
        return buffer;
    }

    /**
     * 设置buffer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuffer(String value) {
        this.buffer = value;
    }

    /**
     * 获取codePage属性的值。
     * 
     */
    public int getCodePage() {
        return codePage;
    }

    /**
     * 设置codePage属性的值。
     * 
     */
    public void setCodePage(int value) {
        this.codePage = value;
    }

}
