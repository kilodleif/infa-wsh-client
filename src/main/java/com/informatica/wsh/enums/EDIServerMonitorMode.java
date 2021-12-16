
package com.informatica.wsh.enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EDIServerMonitorMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EDIServerMonitorMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="SCHEDULED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EDIServerMonitorMode")
@XmlEnum
public enum EDIServerMonitorMode {

    ALL,
    RUNNING,
    SCHEDULED;

    public String value() {
        return name();
    }

    public static EDIServerMonitorMode fromValue(String v) {
        return valueOf(v);
    }

}
