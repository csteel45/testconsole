/**
 * @(#)ConnectionFactory.java $Revision: 1.0 $ $Date: Sep 4, 2007 4:05:06 PM $
 * 
 *                            Copyright � 2007 SOFTWARE AG GS All Rights
 *                            Reserved.
 * 
 *                            This software is the confidential and proprietary
 *                            information of SOFTWARE AG GS
 *                            ("Confidential Information"). You shall not
 *                            disclose such Confidential Information and shall
 *                            use it only in accordance with the terms of the
 *                            license agreement you entered into with SOFTWARE AG GS
 *                            Software.
 * 
 *                            SOFTWARE AG GS MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
 *                            THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR
 *                            IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
 *                            WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 *                            PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SOFTWARE AG GS
 *                            SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 *                            LICENSEE AS A RESULT OF USING, MODIFYING OR
 *                            DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 * 
 *                            Copyright Version 1.0
 */
package com.softwareaggs.TestConsole.core;

/**
 * TODO Add docs.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 * 
 */
public class ConnectionFactory {

	@SuppressWarnings("unchecked")
	public static Connection createConnection(ConnectionType type) {
		Connection conn = null;
		String className = null;
// FIXME: Make this configurable.
		if (type.equals(ConnectionType.JMS)) {
			className = "com.softwareaggs.TestConsole.core.JMSConnection";
		}
		if (type.equals(ConnectionType.HTTP)) {
			className = "com.softwareaggs.TestConsole.core.HttpConnection";
		}
		try {
			Class<Connection> connClass = (Class<Connection>) Class
					.forName(className);
			conn = connClass.newInstance();
		}
		catch (Exception e) {
			System.err.println("Exception creating connection: " + e);
			e.printStackTrace(System.err);
		}
		return conn;
	}
}
