//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.03.25 at 04:49:26 PM EDT 
//


package com.hackathon.QBDemo.model.xml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionQueryRqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionQueryRqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}TransactionQuery"/>
 *       &lt;/sequence>
 *       &lt;attribute name="requestID" type="{}STRTYPE" />
 *       &lt;attribute name="metaData" default="NoMetaData">
 *         &lt;simpleType>
 *           &lt;restriction base="{}STRTYPE">
 *             &lt;enumeration value="NoMetaData"/>
 *             &lt;enumeration value="MetaDataOnly"/>
 *             &lt;enumeration value="MetaDataAndResponseData"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="iterator">
 *         &lt;simpleType>
 *           &lt;restriction base="{}STRTYPE">
 *             &lt;enumeration value="Start"/>
 *             &lt;enumeration value="Continue"/>
 *             &lt;enumeration value="Stop"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="iteratorID" type="{}STRTYPE" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionQueryRqType", propOrder = {
    "txnID",
    "maxReturned",
    "refNumber",
    "refNumberCaseSensitive",
    "refNumberFilter",
    "refNumberRangeFilter",
    "transactionModifiedDateRangeFilter",
    "transactionDateRangeFilter",
    "transactionEntityFilter",
    "transactionAccountFilter",
    "transactionItemFilter",
    "transactionClassFilter",
    "transactionTypeFilter",
    "transactionDetailLevelFilter",
    "transactionPostingStatusFilter",
    "transactionPaidStatusFilter",
    "currencyFilter",
    "includeRetElement"
})
public class TransactionQueryRqType {

    @XmlElement(name = "TxnID")
    protected List<String> txnID;
    @XmlElement(name = "MaxReturned")
    protected BigInteger maxReturned;
    @XmlElement(name = "RefNumber")
    protected List<String> refNumber;
    @XmlElement(name = "RefNumberCaseSensitive")
    protected List<String> refNumberCaseSensitive;
    @XmlElement(name = "RefNumberFilter")
    protected RefNumberFilter refNumberFilter;
    @XmlElement(name = "RefNumberRangeFilter")
    protected RefNumberRangeFilter refNumberRangeFilter;
    @XmlElement(name = "TransactionModifiedDateRangeFilter")
    protected TransactionModifiedDateRangeFilter transactionModifiedDateRangeFilter;
    @XmlElement(name = "TransactionDateRangeFilter")
    protected TransactionDateRangeFilter transactionDateRangeFilter;
    @XmlElement(name = "TransactionEntityFilter")
    protected TransactionEntityFilter transactionEntityFilter;
    @XmlElement(name = "TransactionAccountFilter")
    protected TransactionAccountFilter transactionAccountFilter;
    @XmlElement(name = "TransactionItemFilter")
    protected TransactionItemFilter transactionItemFilter;
    @XmlElement(name = "TransactionClassFilter")
    protected TransactionClassFilter transactionClassFilter;
    @XmlElement(name = "TransactionTypeFilter")
    protected TransactionTypeFilter transactionTypeFilter;
    @XmlElement(name = "TransactionDetailLevelFilter", defaultValue = "SummaryOnly")
    protected String transactionDetailLevelFilter;
    @XmlElement(name = "TransactionPostingStatusFilter", defaultValue = "Either")
    protected String transactionPostingStatusFilter;
    @XmlElement(name = "TransactionPaidStatusFilter", defaultValue = "Either")
    protected String transactionPaidStatusFilter;
    @XmlElement(name = "CurrencyFilter")
    protected CurrencyFilter currencyFilter;
    @XmlElement(name = "IncludeRetElement")
    protected List<String> includeRetElement;
    @XmlAttribute(name = "requestID")
    protected String requestID;
    @XmlAttribute(name = "metaData")
    protected String metaData;
    @XmlAttribute(name = "iterator")
    protected String iterator;
    @XmlAttribute(name = "iteratorID")
    protected String iteratorID;

    /**
     * Gets the value of the txnID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxnID() {
        if (txnID == null) {
            txnID = new ArrayList<String>();
        }
        return this.txnID;
    }

    /**
     * Gets the value of the maxReturned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxReturned() {
        return maxReturned;
    }

    /**
     * Sets the value of the maxReturned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxReturned(BigInteger value) {
        this.maxReturned = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefNumber() {
        if (refNumber == null) {
            refNumber = new ArrayList<String>();
        }
        return this.refNumber;
    }

    /**
     * Gets the value of the refNumberCaseSensitive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refNumberCaseSensitive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefNumberCaseSensitive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefNumberCaseSensitive() {
        if (refNumberCaseSensitive == null) {
            refNumberCaseSensitive = new ArrayList<String>();
        }
        return this.refNumberCaseSensitive;
    }

    /**
     * Gets the value of the refNumberFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RefNumberFilter }
     *     
     */
    public RefNumberFilter getRefNumberFilter() {
        return refNumberFilter;
    }

    /**
     * Sets the value of the refNumberFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNumberFilter }
     *     
     */
    public void setRefNumberFilter(RefNumberFilter value) {
        this.refNumberFilter = value;
    }

    /**
     * Gets the value of the refNumberRangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RefNumberRangeFilter }
     *     
     */
    public RefNumberRangeFilter getRefNumberRangeFilter() {
        return refNumberRangeFilter;
    }

    /**
     * Sets the value of the refNumberRangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefNumberRangeFilter }
     *     
     */
    public void setRefNumberRangeFilter(RefNumberRangeFilter value) {
        this.refNumberRangeFilter = value;
    }

    /**
     * Gets the value of the transactionModifiedDateRangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionModifiedDateRangeFilter }
     *     
     */
    public TransactionModifiedDateRangeFilter getTransactionModifiedDateRangeFilter() {
        return transactionModifiedDateRangeFilter;
    }

    /**
     * Sets the value of the transactionModifiedDateRangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionModifiedDateRangeFilter }
     *     
     */
    public void setTransactionModifiedDateRangeFilter(TransactionModifiedDateRangeFilter value) {
        this.transactionModifiedDateRangeFilter = value;
    }

    /**
     * Gets the value of the transactionDateRangeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDateRangeFilter }
     *     
     */
    public TransactionDateRangeFilter getTransactionDateRangeFilter() {
        return transactionDateRangeFilter;
    }

    /**
     * Sets the value of the transactionDateRangeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDateRangeFilter }
     *     
     */
    public void setTransactionDateRangeFilter(TransactionDateRangeFilter value) {
        this.transactionDateRangeFilter = value;
    }

    /**
     * Gets the value of the transactionEntityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEntityFilter }
     *     
     */
    public TransactionEntityFilter getTransactionEntityFilter() {
        return transactionEntityFilter;
    }

    /**
     * Sets the value of the transactionEntityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEntityFilter }
     *     
     */
    public void setTransactionEntityFilter(TransactionEntityFilter value) {
        this.transactionEntityFilter = value;
    }

    /**
     * Gets the value of the transactionAccountFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAccountFilter }
     *     
     */
    public TransactionAccountFilter getTransactionAccountFilter() {
        return transactionAccountFilter;
    }

    /**
     * Sets the value of the transactionAccountFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAccountFilter }
     *     
     */
    public void setTransactionAccountFilter(TransactionAccountFilter value) {
        this.transactionAccountFilter = value;
    }

    /**
     * Gets the value of the transactionItemFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionItemFilter }
     *     
     */
    public TransactionItemFilter getTransactionItemFilter() {
        return transactionItemFilter;
    }

    /**
     * Sets the value of the transactionItemFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionItemFilter }
     *     
     */
    public void setTransactionItemFilter(TransactionItemFilter value) {
        this.transactionItemFilter = value;
    }

    /**
     * Gets the value of the transactionClassFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionClassFilter }
     *     
     */
    public TransactionClassFilter getTransactionClassFilter() {
        return transactionClassFilter;
    }

    /**
     * Sets the value of the transactionClassFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionClassFilter }
     *     
     */
    public void setTransactionClassFilter(TransactionClassFilter value) {
        this.transactionClassFilter = value;
    }

    /**
     * Gets the value of the transactionTypeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTypeFilter }
     *     
     */
    public TransactionTypeFilter getTransactionTypeFilter() {
        return transactionTypeFilter;
    }

    /**
     * Sets the value of the transactionTypeFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeFilter }
     *     
     */
    public void setTransactionTypeFilter(TransactionTypeFilter value) {
        this.transactionTypeFilter = value;
    }

    /**
     * Gets the value of the transactionDetailLevelFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDetailLevelFilter() {
        return transactionDetailLevelFilter;
    }

    /**
     * Sets the value of the transactionDetailLevelFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDetailLevelFilter(String value) {
        this.transactionDetailLevelFilter = value;
    }

    /**
     * Gets the value of the transactionPostingStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionPostingStatusFilter() {
        return transactionPostingStatusFilter;
    }

    /**
     * Sets the value of the transactionPostingStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionPostingStatusFilter(String value) {
        this.transactionPostingStatusFilter = value;
    }

    /**
     * Gets the value of the transactionPaidStatusFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionPaidStatusFilter() {
        return transactionPaidStatusFilter;
    }

    /**
     * Sets the value of the transactionPaidStatusFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionPaidStatusFilter(String value) {
        this.transactionPaidStatusFilter = value;
    }

    /**
     * Gets the value of the currencyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyFilter }
     *     
     */
    public CurrencyFilter getCurrencyFilter() {
        return currencyFilter;
    }

    /**
     * Sets the value of the currencyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyFilter }
     *     
     */
    public void setCurrencyFilter(CurrencyFilter value) {
        this.currencyFilter = value;
    }

    /**
     * Gets the value of the includeRetElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeRetElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeRetElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeRetElement() {
        if (includeRetElement == null) {
            includeRetElement = new ArrayList<String>();
        }
        return this.includeRetElement;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaData() {
        if (metaData == null) {
            return "NoMetaData";
        } else {
            return metaData;
        }
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaData(String value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the iterator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterator() {
        return iterator;
    }

    /**
     * Sets the value of the iterator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterator(String value) {
        this.iterator = value;
    }

    /**
     * Gets the value of the iteratorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIteratorID() {
        return iteratorID;
    }

    /**
     * Sets the value of the iteratorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIteratorID(String value) {
        this.iteratorID = value;
    }

}
