/**
 * @(#)DataModel.java $Revision: 1.0 $ $Date: Aug 27, 2007 10:33:31 AM $
 * 
 *                    Copyright � 2007 SOFTWARE AG GS All Rights Reserved.
 * 
 *                    This software is the confidential and proprietary
 *                    information of SOFTWARE AG GS
 *                    ("Confidential Information"). You shall not disclose such
 *                    Confidential Information and shall use it only in
 *                    accordance with the terms of the license agreement you
 *                    entered into with SOFTWARE AG GS.
 * 
 *                    SOFTWARE AG GS MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 *                    SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
 *                    INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 *                    MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 *                    NON-INFRINGEMENT. SOFTWARE AG GS SHALL NOT BE LIABLE FOR ANY
 *                    DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING,
 *                    MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 *                    DERIVATIVES.
 * 
 *                    Copyright Version 1.0
 */
package com.softwareaggs.TestConsole.view;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import com.softwareaggs.TestConsole.model.RequestStats;

/**
 * TODO Add docs.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 * 
 */
class ResultTableModel extends AbstractTableModel {
	private static final long serialVersionUID = -6070303090530227420L;
	Vector<RequestStats> tableData = new Vector<RequestStats>();
	final String[] columnNames = { "Number", "Status", "Service Client Time",
			"Service Response Time" };

	public Object getValueAt(int rowIndex, int columnIndex) {
		RequestStats cs = tableData.elementAt(rowIndex);
		switch (columnIndex) {
			case 0:
				return (cs.getRequestNumber());
			case 1:
				return (cs.getState());
			case 2:
				float ct = cs.getTotalConnectTime();
				String connT = (ct < 0.0f ? "n/a" : Float.toString(ct));
				return (connT);
			case 3:
				float wt = cs.getTotalWorkTime();
				String workT = (wt < 0.0f ? "n/a" : Float.toString(wt));
				return (workT);
			default:
				return (null);
		}
	}

	public void addStats() {
		int rowNum = tableData.size();
		RequestStats cs = new RequestStats();
		cs.setRequestNumber(rowNum);
		tableData.insertElementAt(cs, rowNum);
		fireTableRowsInserted(rowNum, rowNum);
	}

	public void removeStats(int row) {
		tableData.removeElementAt(row);
		fireTableDataChanged();
	}

	public int getColumnCount() {
		return (columnNames.length);
	}

	public int getRowCount() {
		return (tableData.size());
	}

	@Override
	public String getColumnName(int column) {
		return (columnNames[column]);
	}

	public void setValueAt(RequestStats cs, int rowNum) {
		tableData.setElementAt(cs, rowNum);
		fireTableRowsUpdated(rowNum, rowNum);
	}

	public void clear() {
		tableData.clear();
	}
}
