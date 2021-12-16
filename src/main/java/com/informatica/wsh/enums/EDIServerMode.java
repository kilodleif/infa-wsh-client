
package com.informatica.wsh.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EDIServerMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EDIServerMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ASCII"/>
 *     &lt;enumeration value="UNICODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EDIServerMode")
@XmlEnum
public enum EDIServerMode {

    ASCII,
    UNICODE;

    public String value() {
        return name();
    }

    public static EDIServerMode fromValue(String v) {
        return valueOf(v);
    }

}
