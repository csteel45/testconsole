/*
 * @(#)ClientManager.java
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
package com.tibco.TestConsole.model;

import java.io.Serializable;

import com.tibco.TestConsole.view.monitor.MonitorFeedListener;


/**
 * TODO Add docs.
 * 
 * @author Christopher Steel, Principal Architect - TIBCO
 * @version Aug 24, 2007 3:02:58 PM
 */
public interface ClientManager extends Serializable {
	public static final int SEQUENTIAL = 0;
	public static final int SIMULTANEOUS = 1;

	public void notify(RequestStats stats);

	public void update(RequestStats stats);

// public void addWorker(String id, Thread t);
	public void startRequests(int numRequests, String requestDir,
			String queryTargets, boolean simultaneous);

	public void clear();

	public void registerMonitorListener(MonitorFeedListener listener);
}
