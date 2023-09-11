//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.26 at 10:15:02 PM EST 
//


package com.softwareaggs.vs.ut;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * TBD
 * 
 * <p>Java class for AlienStudentVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlienStudentVerificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://niem.gov/niem/domains/immigration/2.0}AlienStudentType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}SevisID"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}ImmigrationStatusCode" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/screening/2.0}VisaNumberID" minOccurs="0"/>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/verification/2.0/verification}StatusChangeDate" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/screening/2.0}PortOfEntryCode" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/screening/2.0}EntryDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlienStudentVerificationType", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification", propOrder = {
    "sevisID",
    "immigrationStatusCode",
    "visaNumberID",
    "statusChangeDate",
    "portOfEntryCode",
    "entryDate"
})
public class AlienStudentVerificationType
    extends AlienStudentType
{

    @XmlElement(name = "SevisID", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification", required = true)
    protected IdentificationType sevisID;
    @XmlElement(name = "ImmigrationStatusCode", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected TextType immigrationStatusCode;
    @XmlElement(name = "VisaNumberID", namespace = "http://niem.gov/niem/domains/screening/2.0", nillable = true)
    protected String visaNumberID;
    @XmlElement(name = "StatusChangeDate", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification", nillable = true)
    protected DateType statusChangeDate;
    @XmlElement(name = "PortOfEntryCode", namespace = "http://niem.gov/niem/domains/screening/2.0", nillable = true)
    protected TextType portOfEntryCode;
    @XmlElement(name = "EntryDate", namespace = "http://niem.gov/niem/domains/screening/2.0", nillable = true)
    protected DateType entryDate;

    /**
     * Gets the value of the sevisID property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getSevisID() {
        return sevisID;
    }

    /**
     * Sets the value of the sevisID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setSevisID(IdentificationType value) {
        this.sevisID = value;
    }

    /**
     * Gets the value of the immigrationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getImmigrationStatusCode() {
        return immigrationStatusCode;
    }

    /**
     * Sets the value of the immigrationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setImmigrationStatusCode(TextType value) {
        this.immigrationStatusCode = value;
    }

    /**
     * Gets the value of the visaNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumberID() {
        return visaNumberID;
    }

    /**
     * Sets the value of the visaNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumberID(String value) {
        this.visaNumberID = value;
    }

    /**
     * Gets the value of the statusChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * Sets the value of the statusChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setStatusChangeDate(DateType value) {
        this.statusChangeDate = value;
    }

    /**
     * Gets the value of the portOfEntryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPortOfEntryCode() {
        return portOfEntryCode;
    }

    /**
     * Sets the value of the portOfEntryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPortOfEntryCode(TextType value) {
        this.portOfEntryCode = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEntryDate(DateType value) {
        this.entryDate = value;
    }

}
