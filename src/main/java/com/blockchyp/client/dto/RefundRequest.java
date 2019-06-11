package com.blockchyp.client.dto;

public class RefundRequest extends PaymentRequest {
	
	private String transactionId;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
