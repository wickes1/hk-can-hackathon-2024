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
 *       &lt;sequence>
 *         &lt;element ref="{}TxnEventType" maxOccurs="unbounded"/>
 *         &lt;element ref="{}TxnEventOperation" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "txnEventType",
    "txnEventOperation"
})
@XmlRootElement(name = "TxnEventSubscription")
public class TxnEventSubscription {

    @XmlElement(name = "TxnEventType", required = true)
    protected List<String> txnEventType;
    @XmlElement(name = "TxnEventOperation", required = true)
    protected List<String> txnEventOperation;

    /**
     * Gets the value of the txnEventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnEventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxnEventType() {
        if (txnEventType == null) {
            txnEventType = new ArrayList<String>();
        }
        return this.txnEventType;
    }

    /**
     * Gets the value of the txnEventOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnEventOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnEventOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxnEventOperation() {
        if (txnEventOperation == null) {
            txnEventOperation = new ArrayList<String>();
        }
        return this.txnEventOperation;
    }

}
