/*
 * @(#)RunInfo.java
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
package com.softwareaggs.TestConsole.model;

/**
 * TODO Add docs.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 */
public class RunInfo {
	private int numRequests = 0;

	public RunInfo() {

	}

	public RunInfo(int numRequests) {
		this.numRequests = numRequests;
	}

	public int getNumRequests() {
		return numRequests;
	}

	public void setNumRequests(int numRequests) {
		this.numRequests = numRequests;
	}

	@Override
	public String toString() {
		return new String("RunInfo: " + numRequests);
	}
}
