//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.11 at 10:09:34 PM EST 
//


package com.softwareaggs.vs.ut;

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
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}CitizenshipCertificateIdentification" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/domains/immigration/2.0}CitizenshipNaturalizationDate" minOccurs="0"/>
 *         &lt;element ref="{http://niem.gov/niem/niem-core/2.0}Person" minOccurs="0"/>
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
    "citizenshipCertificateIdentification",
    "citizenshipNaturalizationDate",
    "person"
})
@XmlRootElement(name = "NaturalizationVerification", namespace = "http://uscis.gov/uscis/xsd/services/verification/2.0/verification")
public class NaturalizationVerification {

    @XmlElement(name = "CitizenshipCertificateIdentification", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected IdentificationType citizenshipCertificateIdentification;
    @XmlElement(name = "CitizenshipNaturalizationDate", namespace = "http://niem.gov/niem/domains/immigration/2.0", nillable = true)
    protected DateType citizenshipNaturalizationDate;
    @XmlElement(name = "Person", nillable = true)
    protected PersonType person;

    /**
     * Gets the value of the citizenshipCertificateIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getCitizenshipCertificateIdentification() {
        return citizenshipCertificateIdentification;
    }

    /**
     * Sets the value of the citizenshipCertificateIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setCitizenshipCertificateIdentification(IdentificationType value) {
        this.citizenshipCertificateIdentification = value;
    }

    /**
     * Gets the value of the citizenshipNaturalizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getCitizenshipNaturalizationDate() {
        return citizenshipNaturalizationDate;
    }

    /**
     * Sets the value of the citizenshipNaturalizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setCitizenshipNaturalizationDate(DateType value) {
        this.citizenshipNaturalizationDate = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

}
