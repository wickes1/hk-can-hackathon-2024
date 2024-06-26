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
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence>
 *         &lt;element ref="{}TxnDate" minOccurs="0"/>
 *         &lt;element name="RefNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{}STRTYPE">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{}Memo" minOccurs="0"/>
 *         &lt;element ref="{}IsAdjustment" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}IsHomeCurrencyAdjustment"/>
 *           &lt;group ref="{}CurrencyExchangeRate"/>
 *         &lt;/choice>
 *         &lt;element ref="{}ExternalGUID" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}JournalDebitLine"/>
 *           &lt;element ref="{}JournalCreditLine"/>
 *         &lt;/choice>
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
    "refNumber",
    "memo",
    "isAdjustment",
    "isHomeCurrencyAdjustment",
    "isAmountsEnteredInHomeCurrency",
    "currencyRef",
    "exchangeRate",
    "externalGUID",
    "journalDebitLineOrJournalCreditLine"
})
@XmlRootElement(name = "JournalEntryAdd")
public class JournalEntryAdd {

    @XmlElement(name = "TxnDate")
    protected String txnDate;
    @XmlElement(name = "RefNumber")
    protected String refNumber;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "IsAdjustment")
    protected String isAdjustment;
    @XmlElement(name = "IsHomeCurrencyAdjustment")
    protected String isHomeCurrencyAdjustment;
    @XmlElement(name = "IsAmountsEnteredInHomeCurrency")
    protected String isAmountsEnteredInHomeCurrency;
    @XmlElement(name = "CurrencyRef")
    protected CurrencyRef currencyRef;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "ExternalGUID")
    protected String externalGUID;
    @XmlElements({
        @XmlElement(name = "JournalDebitLine", type = JournalDebitLine.class),
        @XmlElement(name = "JournalCreditLine", type = JournalCreditLine.class)
    })
    protected List<Object> journalDebitLineOrJournalCreditLine;
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
     * Gets the value of the isAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAdjustment() {
        return isAdjustment;
    }

    /**
     * Sets the value of the isAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAdjustment(String value) {
        this.isAdjustment = value;
    }

    /**
     * Gets the value of the isHomeCurrencyAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsHomeCurrencyAdjustment() {
        return isHomeCurrencyAdjustment;
    }

    /**
     * Sets the value of the isHomeCurrencyAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsHomeCurrencyAdjustment(String value) {
        this.isHomeCurrencyAdjustment = value;
    }

    /**
     * Gets the value of the isAmountsEnteredInHomeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAmountsEnteredInHomeCurrency() {
        return isAmountsEnteredInHomeCurrency;
    }

    /**
     * Sets the value of the isAmountsEnteredInHomeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAmountsEnteredInHomeCurrency(String value) {
        this.isAmountsEnteredInHomeCurrency = value;
    }

    /**
     * Gets the value of the currencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyRef }
     *     
     */
    public CurrencyRef getCurrencyRef() {
        return currencyRef;
    }

    /**
     * Sets the value of the currencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyRef }
     *     
     */
    public void setCurrencyRef(CurrencyRef value) {
        this.currencyRef = value;
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
     * Gets the value of the externalGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalGUID() {
        return externalGUID;
    }

    /**
     * Sets the value of the externalGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalGUID(String value) {
        this.externalGUID = value;
    }

    /**
     * Gets the value of the journalDebitLineOrJournalCreditLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalDebitLineOrJournalCreditLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalDebitLineOrJournalCreditLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalDebitLine }
     * {@link JournalCreditLine }
     * 
     * 
     */
    public List<Object> getJournalDebitLineOrJournalCreditLine() {
        if (journalDebitLineOrJournalCreditLine == null) {
            journalDebitLineOrJournalCreditLine = new ArrayList<Object>();
        }
        return this.journalDebitLineOrJournalCreditLine;
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
