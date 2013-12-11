package com.tibco.vs.ut.TA;

import junit.framework.JUnit4TestAdapter;

import org.junit.Assert;
import org.junit.Test;

import com.tibco.TestConsole.core.JMSConnection;
import com.tibco.TestConsole.core.RequestMessage;
import com.tibco.TestConsole.core.ResponseMessage;


public class SEVISUnavailableTestSuite extends JMSConnection {

	/**
	 * Test harness for the Verification Service.
	 */
	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}

	@Test
	public void TC1() throws Exception {
		RequestMessage request = new RequestMessage();
		request.setQueryTarget("SEVIS");
		request.setTransactionID(this.getClass().getName() + ".TC1-"
				+ getNextSequenceNumber());

		System.err.println("MAKE SURE SEVIS IS UNAVAILABLE");

		request.setSevisID("44033");
		send(request);

		ResponseMessage response = getResults();

		Assert.assertNotNull(response.getEsbException());
		Assert
				.assertTrue(response.getEsbException().getErrorMessage()
						.length() > 1);
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(SEVISUnavailableTestSuite.class);
	}
}
