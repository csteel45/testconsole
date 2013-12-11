/**
 * @(#)Connection.java $Revision: 1.0 $ $Date: Aug 31, 2007 7:06:23 PM $
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
package com.tibco.TestConsole.core;

import java.io.File;

/**
 * TODO Add docs.
 * 
 * @author Christopher Steel, Principal Architect - TIBCO
 * @version Aug 31, 2007 7:06:23 PM
 * 
 */
public interface Connection {

	public abstract void send(RequestMessage request) throws Exception;

	public abstract void sendRequestFiles(java.lang.String dirName)
			throws Exception;

	public abstract int sendRequestFile(java.lang.String dirName)
			throws Exception;

	public abstract void send(java.lang.String request,
			java.lang.String queryTarget) throws Exception;

	public abstract void sendFile(File file) throws Exception;

	public abstract ResponseMessage getResults() throws Exception;

	public abstract ResponseMessage getResults(boolean b) throws Exception;

}