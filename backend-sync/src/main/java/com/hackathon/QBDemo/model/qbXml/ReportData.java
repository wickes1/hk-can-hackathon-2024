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
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}DataRow"/>
 *           &lt;element ref="{}TextRow"/>
 *           &lt;element ref="{}SubtotalRow"/>
 *           &lt;element ref="{}TotalRow"/>
 *         &lt;/choice>
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
    "dataRowOrTextRowOrSubtotalRow"
})
@XmlRootElement(name = "ReportData")
public class ReportData {

    @XmlElements({
        @XmlElement(name = "DataRow", type = DataRow.class),
        @XmlElement(name = "TextRow", type = TextRow.class),
        @XmlElement(name = "SubtotalRow", type = SubtotalRow.class),
        @XmlElement(name = "TotalRow", type = TotalRow.class)
    })
    protected List<Object> dataRowOrTextRowOrSubtotalRow;

    /**
     * Gets the value of the dataRowOrTextRowOrSubtotalRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataRowOrTextRowOrSubtotalRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataRowOrTextRowOrSubtotalRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataRow }
     * {@link TextRow }
     * {@link SubtotalRow }
     * {@link TotalRow }
     * 
     * 
     */
    public List<Object> getDataRowOrTextRowOrSubtotalRow() {
        if (dataRowOrTextRowOrSubtotalRow == null) {
            dataRowOrTextRowOrSubtotalRow = new ArrayList<Object>();
        }
        return this.dataRowOrTextRowOrSubtotalRow;
    }

}
