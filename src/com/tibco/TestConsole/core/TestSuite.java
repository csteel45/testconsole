/*
 * @(#)TestSuite.java
 * 
 * Copyright © 2007 TIBCO Software, Inc. All Rights Reserved.
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
package com.tibco.TestConsole.core;

/**
 * Runs the various TestSuites in the sub-directories.
 * 
 * @author Christopher Steel, Principal Architect - TIBCO
 * @version Aug 24, 2007 3:02:58 PM
 * 
 */
public class TestSuite {

	public static void main(String args[]) {

		junit.textui.TestRunner.run(com.tibco.vs.ut.C4.TestSuite
				.suite());
		junit.textui.TestRunner.run(com.tibco.vs.ut.SEVIS.TestSuite
				.suite());
		junit.textui.TestRunner.run(com.tibco.vs.ut.CCD.TestSuite
				.suite());
		junit.textui.TestRunner.run(com.tibco.vs.ut.PIERS.TestSuite
				.suite());
		junit.textui.TestRunner.run(com.tibco.vs.ut.TA.TestSuite
				.suite());
		junit.textui.TestRunner.run(com.tibco.vs.ut.CS.TestSuite
				.suite());

	}
}
