
package com.informatica.wsh.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EPingState的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EPingState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ALIVE"/>
 *     &lt;enumeration value="FAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPingState")
@XmlEnum
public enum EPingState {

    ALIVE,
    FAIL;

    public String value() {
        return name();
    }

    public static EPingState fromValue(String v) {
        return valueOf(v);
    }

}
