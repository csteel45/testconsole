//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.11 at 10:09:34 PM EST 
//


package com.softwareaggs.vs.ut;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImmigrationStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmigrationStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/structures/2.0}ComplexObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}ImmigrationStatusCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmigrationStatusType", namespace = "http://niem.gov/niem/domains/immigration/2.0", propOrder = {
    "immigrationStatusCode"
})
public class ImmigrationStatusType
    extends ComplexObjectType
{

    @XmlElement(name = "ImmigrationStatusCode", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected List<TextType> immigrationStatusCode;

    /**
     * Gets the value of the immigrationStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immigrationStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmigrationStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getImmigrationStatusCode() {
        if (immigrationStatusCode == null) {
            immigrationStatusCode = new ArrayList<TextType>();
        }
        return this.immigrationStatusCode;
    }

}
