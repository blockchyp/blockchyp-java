package com.blockchyp.client.dto;

public class AmountRequest extends CoreRequest {
	
	private String currencyCode;
	private String amount;
	private boolean taxExempt;
	private String tipAmount;
	private String taxAmount;
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public boolean isTaxExempt() {
		return taxExempt;
	}
	public void setTaxExempt(boolean taxExempt) {
		this.taxExempt = taxExempt;
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
