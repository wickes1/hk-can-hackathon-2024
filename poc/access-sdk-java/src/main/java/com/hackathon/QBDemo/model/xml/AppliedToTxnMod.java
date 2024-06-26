//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

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
 *         &lt;element ref="{}TxnID"/>
 *         &lt;element ref="{}PaymentAmount" minOccurs="0"/>
 *         &lt;element ref="{}SetCredit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DiscountAmount" minOccurs="0"/>
 *         &lt;element ref="{}DiscountAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}DiscountClassRef" minOccurs="0"/>
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
    "txnID",
    "paymentAmount",
    "setCredit",
    "discountAmount",
    "discountAccountRef",
    "discountClassRef"
})
@XmlRootElement(name = "AppliedToTxnMod")
public class AppliedToTxnMod {

    @XmlElement(name = "TxnID", required = true)
    protected String txnID;
    @XmlElement(name = "PaymentAmount")
    protected String paymentAmount;
    @XmlElement(name = "SetCredit")
    protected List<SetCredit> setCredit;
    @XmlElement(name = "DiscountAmount")
    protected String discountAmount;
    @XmlElement(name = "DiscountAccountRef")
    protected DiscountAccountRef discountAccountRef;
    @XmlElement(name = "DiscountClassRef")
    protected DiscountClassRef discountClassRef;

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnID(String value) {
        this.txnID = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAmount(String value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the setCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetCredit }
     * 
     * 
     */
    public List<SetCredit> getSetCredit() {
        if (setCredit == null) {
            setCredit = new ArrayList<SetCredit>();
        }
        return this.setCredit;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAccountRef }
     *     
     */
    public DiscountAccountRef getDiscountAccountRef() {
        return discountAccountRef;
    }

    /**
     * Sets the value of the discountAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAccountRef }
     *     
     */
    public void setDiscountAccountRef(DiscountAccountRef value) {
        this.discountAccountRef = value;
    }

    /**
     * Gets the value of the discountClassRef property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountClassRef }
     *     
     */
    public DiscountClassRef getDiscountClassRef() {
        return discountClassRef;
    }

    /**
     * Sets the value of the discountClassRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountClassRef }
     *     
     */
    public void setDiscountClassRef(DiscountClassRef value) {
        this.discountClassRef = value;
    }

}
