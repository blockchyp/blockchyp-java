package com.blockchyp.client.dto;

public class TransactionDisplayRequest extends CoreRequest implements ITerminalReference {
	
	private String terminalName;
	private TransactionDisplayTransaction transaction;

	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	public TransactionDisplayTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(TransactionDisplayTransaction transaction) {
		this.transaction = transaction;
	}

}
