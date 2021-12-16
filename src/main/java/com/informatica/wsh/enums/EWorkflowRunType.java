
package com.informatica.wsh.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EWorkflowRunType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EWorkflowRunType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SCHEDULE"/>
 *     &lt;enumeration value="USER_REQUEST"/>
 *     &lt;enumeration value="DEBUG_SESSION"/>
 *     &lt;enumeration value="SERVER_INIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EWorkflowRunType")
@XmlEnum
public enum EWorkflowRunType {

    SCHEDULE,
    USER_REQUEST,
    DEBUG_SESSION,
    SERVER_INIT;

    public String value() {
        return name();
    }

    public static EWorkflowRunType fromValue(String v) {
        return valueOf(v);
    }

}
