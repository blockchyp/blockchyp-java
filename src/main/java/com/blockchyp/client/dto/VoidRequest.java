package com.blockchyp.client.dto;

public class VoidRequest extends CoreRequest {
	
	
	private String token;
	private String entryMethod;
	private String paymentType;
	private String maskedPan;
	private String publicKey;
	private boolean scopeAlert;
	private String cardHolder;
	private ReceiptSuggestions receiptSuggestions;
	private String transactionId;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEntryMethod() {
		return entryMethod;
	}

	public void setEntryMethod(String entryMethod) {
		this.entryMethod = entryMethod;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getMaskedPan() {
		return maskedPan;
	}

	public void setMaskedPan(String maskedPan) {
		this.maskedPan = maskedPan;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public boolean isScopeAlert() {
		return scopeAlert;
	}

	public void setScopeAlert(boolean scopeAlert) {
		this.scopeAlert = scopeAlert;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public ReceiptSuggestions getReceiptSuggestions() {
		return receiptSuggestions;
	}

	public void setReceiptSuggestions(ReceiptSuggestions receiptSuggestions) {
		this.receiptSuggestions = receiptSuggestions;
	}
	
	

}
