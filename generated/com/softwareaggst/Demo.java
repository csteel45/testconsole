/*
 * @(#)Demo.java $Date: Dec 14, 2013 10:42:57 AM $
 * 
 * Copyright © 2013 FortMoon Consulting, Inc. All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of FortMoon
 * Consulting, Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FortMoon Consulting.
 * 
 * FORTMOON MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT. FORTMOON SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES.
 */
package com.softwareaggst;

/**
 * @author Christopher Steel - FortMoon Consulting, Inc.
 * 
 * @since Dec 14, 2013 10:42:57 AM
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.stream.XMLStreamReader;

import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamReader;

public class Demo {
	static String theJsonString = "{ \"objectA\" : {\"propertyOne\" : \"some val\",\"propertyTwo\" : \"some other val\",\"objectB\" : {\"propertyA\" : \"some val\",\"propertyB\" : true}}}";

	public static void printObj(Object objUn) throws InstantiationException,
			IllegalAccessException {
		for (Class<?> c : objUn.getClass().getDeclaredClasses()) {
			System.out.println("Class: " + c.getName());
		}
		System.out.println("Methods: ");
		for (Method m : objUn.getClass().getDeclaredMethods()) {
			System.out.println("Method: " + m.getName());
		}
		System.out.println("Fields: ");
		for (Field f : objUn.getClass().getDeclaredFields()) {
			System.out.println("Field: " + f.getName());
			f.setAccessible(true);

			Class<?> targetType = f.getType();
			Object objectValue = targetType.newInstance();

			Object value = f.get(objUn);
			if (value instanceof Class) {
				printObj(value);
			}
			else
				System.out.println("Field value: " + value);
		}

	}

	public static void main(String[] args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(ObjectA.class);
		JSONObject obj = new JSONObject(theJsonString);
		Configuration config = new Configuration();

		MappedNamespaceConvention con = new MappedNamespaceConvention(config);
		XMLStreamReader xmlStreamReader = new MappedXMLStreamReader(obj, con);
		Unmarshaller unmarshaller = jc.createUnmarshaller();

		Object objUn = unmarshaller.unmarshal(xmlStreamReader);
		printObj(objUn);
		System.out.println("Classes: ");

// Marshaller marshaller = jc.createMarshaller();
// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
// marshaller.marshal(objectA, System.out);
	}
}

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectA")
class ObjectA {
	@XmlElement(required = true)
	protected String propertyOne;
	@XmlElement(required = true)
	protected String propertyTwo;
	@XmlElement(required = true)
	protected ObjectB objectB;
}

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectB")
class ObjectB {
	@XmlElement(required = true)
	protected String propertyA;
	@XmlElement(required = true)
	protected boolean propertyB;
}
