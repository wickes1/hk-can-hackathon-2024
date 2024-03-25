//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element ref="{}TransferFromAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}TransferToAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}ClassRef" minOccurs="0"/>
 *         &lt;element ref="{}Amount" minOccurs="0"/>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="defMacro" type="{}MACROTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "txnDate",
    "transferFromAccountRef",
    "transferToAccountRef",
    "classRef",
    "amount",
    "memo"
})
@XmlRootElement(name = "TransferAdd")
public class TransferAdd {

    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "TransferFromAccountRef")
    protected TransferFromAccountRef transferFromAccountRef;
    @XmlElement(name = "TransferToAccountRef")
    protected TransferToAccountRef transferToAccountRef;
    @XmlElement(name = "ClassRef")
    protected ClassRef classRef;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlAttribute(name = "defMacro")
    protected String defMacro;

    /**
     * Gets the value of the txnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the transferFromAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferFromAccountRef }
     *     
     */
    public TransferFromAccountRef getTransferFromAccountRef() {
        return transferFromAccountRef;
    }

    /**
     * Sets the value of the transferFromAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferFromAccountRef }
     *     
     */
    public void setTransferFromAccountRef(TransferFromAccountRef value) {
        this.transferFromAccountRef = value;
    }

    /**
     * Gets the value of the transferToAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link TransferToAccountRef }
     *     
     */
    public TransferToAccountRef getTransferToAccountRef() {
        return transferToAccountRef;
    }

    /**
     * Sets the value of the transferToAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferToAccountRef }
     *     
     */
    public void setTransferToAccountRef(TransferToAccountRef value) {
        this.transferToAccountRef = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ClassRef }
     *     
     */
    public ClassRef getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassRef }
     *     
     */
    public void setClassRef(ClassRef value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the defMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefMacro() {
        return defMacro;
    }

    /**
     * Sets the value of the defMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefMacro(String value) {
        this.defMacro = value;
    }

}
