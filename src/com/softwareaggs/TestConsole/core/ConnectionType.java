/**
 * @(#)ConnectionType.java $Revision: 1.0 $ $Date: Sep 4, 2007 4:18:56 PM $
 * 
 *                         Copyright � 2007 TIBCO Software, Inc. All Rights
 *                         Reserved.
 * 
 *                         This software is the confidential and proprietary
 *                         information of TIBCO Software, Inc.
 *                         ("Confidential Information"). You shall not disclose
 *                         such Confidential Information and shall use it only
 *                         in accordance with the terms of the license agreement
 *                         you entered into with TIBCO Software.
 * 
 *                         TIBCO MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 *                         THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR
 *                         IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 *                         WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 *                         PARTICULAR PURPOSE, OR NON-INFRINGEMENT. TIBCO SHALL
 *                         NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS
 *                         A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS
 *                         SOFTWARE OR ITS DERIVATIVES.
 * 
 *                         Copyright Version 1.0
 */
package com.softwareaggs.TestConsole.core;

/**
 * TODO Add docs.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 * 
 */
public class ConnectionType {
	public static final ConnectionType JMS = new ConnectionType("JMS");
	public static final ConnectionType HTTP = new ConnectionType("HTTP");
	private final String connectionType;

	private ConnectionType(String type) {
		connectionType = type;
	}

	@Override
	public boolean equals(Object that) {
		if (!(that instanceof ConnectionType)) {
			return false;
		}
		return ((ConnectionType) that).connectionType
				.equals(this.connectionType);
	}

	@Override
	public int hashCode() {
		return connectionType.hashCode();
	}
}
