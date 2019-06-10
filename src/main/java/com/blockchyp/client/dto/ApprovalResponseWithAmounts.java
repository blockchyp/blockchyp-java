package com.blockchyp.client.dto;

public class ApprovalResponseWithAmounts extends ApprovalResponse {
	
	private boolean partialAuth;
	private String altCurrency;
	private String currencyCode;
	private String requestedAmount;
	private String authorizedAmount;
	private String tipAmount;
	private String taxAmount;
	public boolean isPartialAuth() {
		return partialAuth;
	}
	public void setPartialAuth(boolean partialAuth) {
		this.partialAuth = partialAuth;
	}
	public String getAltCurrency() {
		return altCurrency;
	}
	public void setAltCurrency(String altCurrency) {
		this.altCurrency = altCurrency;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getRequestedAmount() {
		return requestedAmount;
	}
	public void setRequestedAmount(String requestedAmount) {
		this.requestedAmount = requestedAmount;
	}
	public String getAuthorizedAmount() {
		return authorizedAmount;
	}
	public void setAuthorizedAmount(String authorizedAmount) {
		this.authorizedAmount = authorizedAmount;
	}
	public String getTipAmount() {
		return tipAmount;
	}
	public void setTipAmount(String tipAmount) {
		this.tipAmount = tipAmount;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	

}
