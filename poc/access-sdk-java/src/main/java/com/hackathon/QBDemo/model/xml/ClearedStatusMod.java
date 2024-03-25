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
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="TxnID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>IDTYPE">
 *                 &lt;attribute name="useMacro" type="{}MACROTYPE" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TxnLineID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;>IDTYPE">
 *                 &lt;attribute name="useMacro" type="{}MACROTYPE" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}ClearedStatus"/>
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
    "txnLineID",
    "clearedStatus"
})
@XmlRootElement(name = "ClearedStatusMod")
public class ClearedStatusMod {

    @XmlElement(name = "TxnID", required = true)
    protected ClearedStatusMod.TxnID txnID;
    @XmlElement(name = "TxnLineID")
    protected ClearedStatusMod.TxnLineID txnLineID;
    @XmlElement(name = "ClearedStatus", required = true)
    protected String clearedStatus;

    /**
     * Gets the value of the txnID property.
     * 
     * @return
     *     possible object is
     *     {@link ClearedStatusMod.TxnID }
     *     
     */
    public ClearedStatusMod.TxnID getTxnID() {
        return txnID;
    }

    /**
     * Sets the value of the txnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearedStatusMod.TxnID }
     *     
     */
    public void setTxnID(ClearedStatusMod.TxnID value) {
        this.txnID = value;
    }

    /**
     * Gets the value of the txnLineID property.
     * 
     * @return
     *     possible object is
     *     {@link ClearedStatusMod.TxnLineID }
     *     
     */
    public ClearedStatusMod.TxnLineID getTxnLineID() {
        return txnLineID;
    }

    /**
     * Sets the value of the txnLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearedStatusMod.TxnLineID }
     *     
     */
    public void setTxnLineID(ClearedStatusMod.TxnLineID value) {
        this.txnLineID = value;
    }

    /**
     * Gets the value of the clearedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearedStatus() {
        return clearedStatus;
    }

    /**
     * Sets the value of the clearedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearedStatus(String value) {
        this.clearedStatus = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>IDTYPE">
     *       &lt;attribute name="useMacro" type="{}MACROTYPE" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TxnID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "useMacro")
        protected String useMacro;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the useMacro property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseMacro() {
            return useMacro;
        }

        /**
         * Sets the value of the useMacro property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseMacro(String value) {
            this.useMacro = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;>IDTYPE">
     *       &lt;attribute name="useMacro" type="{}MACROTYPE" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TxnLineID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "useMacro")
        protected String useMacro;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the useMacro property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseMacro() {
            return useMacro;
        }

        /**
         * Sets the value of the useMacro property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseMacro(String value) {
            this.useMacro = value;
        }

    }

}
