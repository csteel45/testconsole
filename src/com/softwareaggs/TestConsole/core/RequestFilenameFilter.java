/*
 * @(#)RequestFilenameFilter.java
 * 
 * Copyright � 2007 SOFTWARE AG GS All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of SOFTWARE AG GS
 * Software, Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with SOFTWARE AG GS.
 * 
 * SOFTWARE AG GS MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT. SOFTWARE AG GS SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES.
 * 
 * Copyright Version 1.0
 */
package com.softwareaggs.TestConsole.core;

import java.io.File;
import java.io.FilenameFilter;

/**
 * This class implements a FilenameFilter and is used to filter out all non-XML
 * files in a given directory. Only files with the extension '.xml' are
 * returned.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 * 
 * @see java.io.FilenameFilter
 */
public class RequestFilenameFilter implements FilenameFilter {
	private java.lang.String ext = ".xml";

	public RequestFilenameFilter(java.lang.String ext) {
		this.ext = ext;
	}

	/**
	 * Returns true if the filename ends in .xml
	 */
	public boolean accept(File file, java.lang.String filename) {
// System.err.println("Filename = " + filename);
		if (filename.endsWith(this.ext)) {
			return true;
		}
// System.err.println("Failed Filename = " + filename);
		return false;
	}
}
