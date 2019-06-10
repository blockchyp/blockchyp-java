package com.blockchyp.client.dto;

/**
 * Models common information for all SDK requests.
 * 
 * @author jeffreydpayne
 *
 */

public class CoreRequest {

	/**
	 * This should be the transaction number or invoice number used by your application.
	 */
	private String transactionRef;
	
	/**
	 * For law firms and other systems with split bank account settlement, this should
	 * be the destination bank account for the deposit.
	 */
	private String destinationAccount;
	
	/**
	 * Flags this as a test transaction.  Will route to the test url: https://test.blockchyp.com.
	 */
	private boolean test;
	
	public String getTransactionRef() {
		return transactionRef;
	}
	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}
	public String getDestinationAccount() {
		return destinationAccount;
	}
	public void setDestinationAccount(String destinationAccount) {
		this.destinationAccount = destinationAccount;
	}
	public boolean isTest() {
		return test;
	}
	public void setTest(boolean test) {
		this.test = test;
	}
	
}
