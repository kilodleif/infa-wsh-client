
package com.informatica.wsh.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetAllTaskInstancesRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetAllTaskInstancesRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkflowInfo" type="{http://www.informatica.com/wsh}WorkflowInfo"/>
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAllTaskInstancesRequest", propOrder = {
    "workflowInfo",
    "depth"
})
public class GetAllTaskInstancesRequest {

    @XmlElement(name = "WorkflowInfo", required = true)
    protected WorkflowInfo workflowInfo;
    @XmlElement(name = "Depth")
    protected int depth;

    /**
     * 获取workflowInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WorkflowInfo }
     *     
     */
    public WorkflowInfo getWorkflowInfo() {
        return workflowInfo;
    }

    /**
     * 设置workflowInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowInfo }
     *     
     */
    public void setWorkflowInfo(WorkflowInfo value) {
        this.workflowInfo = value;
    }

    /**
     * 获取depth属性的值。
     * 
     */
    public int getDepth() {
        return depth;
    }

    /**
     * 设置depth属性的值。
     * 
     */
    public void setDepth(int value) {
        this.depth = value;
    }

}
