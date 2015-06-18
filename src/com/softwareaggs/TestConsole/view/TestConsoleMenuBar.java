/**
 * @(#)TestConsoleMenuBar.java $Revision: 1.0 $ $Date: Aug 27, 2007 9:44:11 AM $
 * 
 *                             Copyright � 2007 SOFTWARE AG GS All Rights
 *                             Reserved.
 * 
 *                             This software is the confidential and proprietary
 *                             information of SOFTWARE AG GS
 *                             ("Confidential Information"). You shall not
 *                             disclose such Confidential Information and shall
 *                             use it only in accordance with the terms of the
 *                             license agreement you entered into with SOFTWARE AG GS
 *                             Software.
 * 
 *                             SOFTWARE AG GS MAKES NO REPRESENTATIONS OR WARRANTIES
 *                             ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 *                             EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 *                             THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 *                             FITNESS FOR A PARTICULAR PURPOSE, OR
 *                             NON-INFRINGEMENT. SOFTWARE AG GS SHALL NOT BE LIABLE FOR
 *                             ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF
 *                             USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR
 *                             ITS DERIVATIVES.
 * 
 *                             Copyright Version 1.0
 */
package com.softwareaggs.TestConsole.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * This class constructs the JMenu bar for the TestConsole application. It
 * controls the menu settings and issues the appropriate call-backs.
 * 
 * @author Christopher Steel, Chief Solution Architect - Software AG GS
 * @version Dec 10, 2013 7:06:23 PM
 * 
 * @see com.softwareaggs.TestConsole.TestConsole
 * @see javax.swing.JMenuBar
 */
public class TestConsoleMenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private transient ActionListener listener;

	/**
	 * Private constructor to prevent construction without appropriate event
	 * handlers.
	 * 
	 */
	@SuppressWarnings("unused")
	private TestConsoleMenuBar() {

	}

	/**
	 * Public constructor for creating a TestCosnoleMenuBar.
	 * 
	 * @param jFrame
	 *            The JFrame instance of the owning application.
	 * @param aListener
	 *            An action listener for handling menu events.
	 */
	public TestConsoleMenuBar(JFrame jFrame, ActionListener aListener) {
		super();
		this.frame = jFrame;
		this.listener = aListener;

		JMenu menu;
		JMenuItem menuItem;

		menu = new JMenu("File");
		this.add(menu);

		menuItem = menu.add(new JMenuItem("Reset"));
		menuItem.addActionListener(listener);

		menuItem = menu.add(new JMenuItem("Exit"));
		menuItem.addActionListener(listener);

		/* TestConsole related stuff. */
		menu = new JMenu("Options");
		this.add(menu);

		menuItem = menu.add(new LookAndFeelMenu(frame, "Look and Feel"));
		// menuItem.addActionListener(new ThemeAction());

		/* TestConsole related stuff. */
		menu = new JMenu("Help");
		try {
			menuItem = menu.add(new JMenuItem("Documentation"));
			menuItem.addActionListener(listener);
		}
		catch (Exception mue) {
			System.out.println("Exception: " + mue);
		}
		menu.addSeparator();
		menuItem = menu.add(new JMenuItem("About Test Console"));

		menuItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				AboutDialog dialog = new AboutDialog(frame,
						"Terracotta Test Console", "Christopher Steel", "1.0",
						"2013-12-13", "Copyright \u00A9 2013 Software AG GS",
						"Glasgow", "images/logo_sag.png");
				dialog.setVisible(true);
			}
		});

		this.add(Box.createHorizontalGlue());
		this.add(menu);

		this.setVisible(true);
	}
}
