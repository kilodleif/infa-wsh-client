
package com.informatica.wsh.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EPerformanceCounterType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EPerformanceCounterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="STRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPerformanceCounterType")
@XmlEnum
public enum EPerformanceCounterType {

    INTEGER,
    STRING;

    public String value() {
        return name();
    }

    public static EPerformanceCounterType fromValue(String v) {
        return valueOf(v);
    }

}
