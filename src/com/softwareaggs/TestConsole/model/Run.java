/*
 * @(#)Run.java
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
public class Run {
	private boolean complete = false;
	private int startDelay = 0;
	private boolean simultaneous = false;

	public Run(boolean simultaneou) {
		this.simultaneous = simultaneous;
	}

	public Run(boolean simultaneous, int delay) {
		this(simultaneous);
		this.startDelay = delay;
	}

	public boolean isSimultaneous() {
		return simultaneous;
	}

	public void setSimultaneous(boolean simultaneous) {
		this.simultaneous = simultaneous;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public int getStartDelay() {
		return startDelay;
	}

	public void setStartDelay(int startDelay) {
		this.startDelay = startDelay;
	}
}
