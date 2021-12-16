
package com.informatica.wsh.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ETaskRunStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ETaskRunStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SUCCEEDED"/>
 *     &lt;enumeration value="DISABLED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="STOPPED"/>
 *     &lt;enumeration value="ABORTED"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="SUSPENDING"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="STOPPING"/>
 *     &lt;enumeration value="ABORTING"/>
 *     &lt;enumeration value="WAITING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TERMINATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ETaskRunStatus")
@XmlEnum
public enum ETaskRunStatus {

    SUCCEEDED,
    DISABLED,
    FAILED,
    STOPPED,
    ABORTED,
    RUNNING,
    SUSPENDING,
    SUSPENDED,
    STOPPING,
    ABORTING,
    WAITING,
    UNKNOWN,
    TERMINATED;

    public String value() {
        return name();
    }

    public static ETaskRunStatus fromValue(String v) {
        return valueOf(v);
    }

}
