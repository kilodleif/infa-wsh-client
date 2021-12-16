
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TypeStartWorkflowExResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TypeStartWorkflowExResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RunId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeStartWorkflowExResponse", propOrder = {
    "runId"
})
public class TypeStartWorkflowExResponse {

    @XmlElement(name = "RunId")
    protected int runId;

    /**
     * 获取runId属性的值。
     * 
     */
    public int getRunId() {
        return runId;
    }

    /**
     * 设置runId属性的值。
     * 
     */
    public void setRunId(int value) {
        this.runId = value;
    }

}
