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
 * 
 * 			
 * 
 * <p>Java class for ESBExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESBExceptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://uscis.gov/uscis/xsd/services/exceptions/0.1}ESBException"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESBExceptionType", namespace = "http://uscis.gov/uscis/xsd/services/exceptions/0.1", propOrder = {
    "esbException"
})
public class ESBExceptionType {

    @XmlElement(name = "ESBException", namespace = "http://uscis.gov/uscis/xsd/services/exceptions/0.1", required = true)
    protected ESBException esbException;

    /**
     * Gets the value of the esbException property.
     * 
     * @return
     *     possible object is
     *     {@link ESBException }
     *     
     */
    public ESBException getESBException() {
        return esbException;
    }

    /**
     * Sets the value of the esbException property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESBException }
     *     
     */
    public void setESBException(ESBException value) {
        this.esbException = value;
    }

}
