/*
 * @(#)Client.java
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

import com.softwareaggs.TestConsole.core.Connection;
import com.softwareaggs.TestConsole.core.ConnectionFactory;
import com.softwareaggs.TestConsole.core.ConnectionType;
import com.softwareaggs.TestConsole.core.ResponseMessage;

/**
 * This class is the Runnable form of a VS request. It sends a request and waits
 * for the the appropriate number of responses. It tracks the time for sending
 * and receiving and updates its stats, notifying the Dispatcher after state
 * changes.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 * 
 * @see com.softwareaggs.TestConsole.model.ClientManger
 * @see com.softwareaggs.TestConsole.model.Dispatcher
 * @see com.softwareaggs.TestConsole.core.ResponseMessage
 */
public class Client implements Runnable {
	private ClientManager manager;
	private String name = null;
	private Integer reqNum;
	private final RequestStats stats;
	private String RequestDir;
	protected Connection conn;
	public static final String SUCCESS = "SUCCESS";
	public static final String COMPLETE = "COMPLETE";
	public static final String FAILURE = "FAILURE";
	public static final String PENDING = "Pending";
	public static final String SENT = "Sent";

	private Client() {
		super();
		manager = null;
		stats = new RequestStats();
		conn = ConnectionFactory.createConnection(ConnectionType.JMS);
	}

	/**
	 * Construct a Client object with the number of this particular request.
	 * 
	 * @param reqNum
	 *            The number to use as an identifier for this request.
	 */
	public Client(Integer reqNum) {
		this();
		this.reqNum = reqNum;
		this.setName(Integer.toString(reqNum));
	}

	/**
	 * Called by a Thread from an Executor's thread pool. initializes the
	 * request stats, sends the request and waits to recieve the responses from
	 * the VS services specfied in the query target attribute.
	 */
	public void run() {
		try {
			stats.setRequestNumber(reqNum);
			stats.setID(name);
			stats.setState(Client.PENDING);
			manager.update(stats);
			// System.out.println("RequestDir = " + getRequestDir());

			stats.markConnectStart();
			int numServices;
			try {
				numServices = conn.sendRequestFile(getRequestDir());
			}
			catch (Exception e) {
				stats.setState(Client.FAILURE);
				// Finally clause will issue the update
				return;
			}
			stats.setState(Client.SENT);
			stats.markConnectEnd();
			manager.update(stats);

			stats.markWorkStart();

			for (int i = 0; i < numServices; i++) {
				ResponseMessage result = conn.getResults(false);
				if (result == null) {
					throw new Exception("Timeout");
				}
				if (result.getEsbException() != null) {
					throw new Exception("ESBException: "
							+ result.getEsbException().toString());
				}
			}

			stats.markWorkEnd();
			stats.setRetVal(SUCCESS);
			stats.setState(Client.COMPLETE);
		}
		catch (Exception e) {
			stats.markWorkEnd();
			stats.setState(Client.FAILURE);
			stats.setRetVal(e.toString());
			e.printStackTrace(System.err);
		}
		finally {
			// Update ClientManager of completion
			manager.update(stats);
		}
	}

	public synchronized void register(ClientManager mgr) {
		this.manager = mgr;
	}

	public void setRequestNumber(Integer reqNum) {
		this.reqNum = reqNum;
	}

	public Integer getRequestNumber() {
		return (reqNum);
	}

	public String getRequestDir() {
		return RequestDir;
	}

	public void setRequestDir(String requestDir) {
		RequestDir = requestDir;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
