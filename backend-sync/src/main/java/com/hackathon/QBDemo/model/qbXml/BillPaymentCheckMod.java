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
 *         &lt;group ref="{}TxnCoreMod"/>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element ref="{}BankAccountRef" minOccurs="0"/>
 *         &lt;element ref="{}Amount" minOccurs="0"/>
 *         &lt;element ref="{}ExchangeRate" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}IsToBePrinted"/>
 *           &lt;element name="RefNumber">
 *             &lt;simpleType>
 *               &lt;restriction base="{}STRTYPE">
 *                 &lt;maxLength value="11"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Memo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="4095"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}AppliedToTxnMod" maxOccurs="unbounded" minOccurs="0"/>
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
    "editSequence",
    "txnDate",
    "bankAccountRef",
    "amount",
    "exchangeRate",
    "isToBePrinted",
    "refNumber",
    "memo",
    "appliedToTxnMod"
})
@XmlRootElement(name = "BillPaymentCheckMod")
public class BillPaymentCheckMod {

    @XmlElement(name = "TxnID", required = true)
    protected String txnID;
    @XmlElement(name = "EditSequence", required = true)
    protected String editSequence;
    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "BankAccountRef")
    protected BankAccountRef bankAccountRef;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "IsToBePrinted")
    protected String isToBePrinted;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "AppliedToTxnMod")
    protected List<AppliedToTxnMod> appliedToTxnMod;

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
     * Gets the value of the editSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditSequence() {
        return editSequence;
    }

    /**
     * Sets the value of the editSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditSequence(String value) {
        this.editSequence = value;
    }

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
     * Gets the value of the bankAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountRef }
     *     
     */
    public BankAccountRef getBankAccountRef() {
        return bankAccountRef;
    }

    /**
     * Sets the value of the bankAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountRef }
     *     
     */
    public void setBankAccountRef(BankAccountRef value) {
        this.bankAccountRef = value;
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
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the isToBePrinted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsToBePrinted() {
        return isToBePrinted;
    }

    /**
     * Sets the value of the isToBePrinted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsToBePrinted(String value) {
        this.isToBePrinted = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNumber(String value) {
        this.refNumber = value;
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
     * Gets the value of the appliedToTxnMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedToTxnMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedToTxnMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedToTxnMod }
     * 
     * 
     */
    public List<AppliedToTxnMod> getAppliedToTxnMod() {
        if (appliedToTxnMod == null) {
            appliedToTxnMod = new ArrayList<AppliedToTxnMod>();
        }
        return this.appliedToTxnMod;
    }

}
