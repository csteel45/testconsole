/*
 * @(#)RequestMessage.java
 * 
 * Copyright � 2007 TIBCO Software, Inc. All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of TIBCO
 * Software, Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with TIBCO Software.
 * 
 * TIBCO MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT. TIBCO SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES.
 * 
 * Copyright Version 1.0
 */
package com.softwareaggs.TestConsole.core;

import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;

/**
 * This class wraps the JAXB-generated VerificationRequest class. It converts
 * The generated String any other class parameter methods to usable ones. It
 * contains a toString method that outputs the XML form of the request.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 * 
 * @see com.softwareaggs.vs.ut.VerificationRequest
 */
public class RequestMessage {
	public static final String SOURCE_USER_ID = "User";
	public static final String SOURCE_SYSTEM_ID = "TestConsole";
	public final static String JAXB_CONTEXT = "com.softwareaggs.vs.ut";

	/**
	 * Construct a new RequestMessage Object. Sets the SourceSystemID and the
	 * SourceUserId. Also, creates a new, empty PersonSearchCriteria.
	 */
	public RequestMessage() {
		super();

	}

	/**
	 * Returns a the Query Target attribute from an XML request file.
	 * 
	 * @param requestStr
	 *            The name of the XML request file.
	 * @return The Query Target from the marshaled XML request file.
	 * @throws Exception
	 */
	public static String getMarshalledQueryTarget(String requestStr)
			throws Exception {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXB_CONTEXT);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			FileInputStream stream = new FileInputStream(requestStr);
// VerificationRequest request = (VerificationRequest) unmarshaller
// .unmarshal(stream);
			String request = null;
			return null;
			// return request.getQueryTarget().getValue();
		}
		catch (Exception e) {
			System.err.println("Exception marshalling request: " + e);
			e.printStackTrace(System.err);
			Assert.assertNull(e);
		}
		return null;
	}

	/**
	 * Returns the String representation of this VerificationRequest object.
	 * 
	 * @return The String representation of this object.
	 */
	@Override
	public String toString() {

		java.io.OutputStream stream = new java.io.ByteArrayOutputStream();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JAXB_CONTEXT);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty("jaxb.formatted.output", true);
			// marshaller.setProperty("JMMarshallerImpl.JAXME_INDENTATION_STRING",
			// "\r\n");
			// marshaller.setProperty("jaxb.noNamespaceSchemaLocation",
			// "http://uscis.gov/uscis/xsd/services/verification/2.0/verification");
			marshaller
					.setProperty("jaxb.schemaLocation",
							"http://uscis.gov/uscis/xsd/services/verification/2.0/verification");
			marshaller.marshal(this, stream);
		}
		catch (Exception e) {
			// If you return the error message it might not be caught up front.
			return "";
		}
		return stream.toString();
	}

}
