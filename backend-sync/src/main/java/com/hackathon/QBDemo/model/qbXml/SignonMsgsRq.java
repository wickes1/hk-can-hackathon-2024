//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.qbXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="SignonAppCertRq" type="{}SignonAppCertRqType"/>
 *         &lt;element name="SignonDesktopRq" type="{}SignonDesktopRqType"/>
 *         &lt;element name="SignonTicketRq" type="{}SignonTicketRqType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signonAppCertRqOrSignonDesktopRqOrSignonTicketRq"
})
@XmlRootElement(name = "SignonMsgsRq")
public class SignonMsgsRq {

    @XmlElements({
        @XmlElement(name = "SignonAppCertRq", type = SignonAppCertRqType.class),
        @XmlElement(name = "SignonDesktopRq", type = SignonDesktopRqType.class),
        @XmlElement(name = "SignonTicketRq", type = SignonTicketRqType.class)
    })
    protected List<Object> signonAppCertRqOrSignonDesktopRqOrSignonTicketRq;

    /**
     * Gets the value of the signonAppCertRqOrSignonDesktopRqOrSignonTicketRq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signonAppCertRqOrSignonDesktopRqOrSignonTicketRq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignonAppCertRqOrSignonDesktopRqOrSignonTicketRq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignonAppCertRqType }
     * {@link SignonDesktopRqType }
     * {@link SignonTicketRqType }
     * 
     * 
     */
    public List<Object> getSignonAppCertRqOrSignonDesktopRqOrSignonTicketRq() {
        if (signonAppCertRqOrSignonDesktopRqOrSignonTicketRq == null) {
            signonAppCertRqOrSignonDesktopRqOrSignonTicketRq = new ArrayList<Object>();
        }
        return this.signonAppCertRqOrSignonDesktopRqOrSignonTicketRq;
    }

}
