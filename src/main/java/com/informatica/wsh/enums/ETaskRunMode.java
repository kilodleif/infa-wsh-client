
package com.informatica.wsh.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ETaskRunMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ETaskRunMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="RECOVERY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ETaskRunMode")
@XmlEnum
public enum ETaskRunMode {

    NORMAL,
    RECOVERY;

    public String value() {
        return name();
    }

    public static ETaskRunMode fromValue(String v) {
        return valueOf(v);
    }

}
