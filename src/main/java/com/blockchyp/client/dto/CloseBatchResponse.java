package com.blockchyp.client.dto;

import java.util.Date;
import java.util.Map;

public class CloseBatchResponse extends Acknowledgement {
	
	private Date timestamp;
	private boolean success;
	private String currencyCode;
	private String capturedTotal;
	private String openPreauths;
	@SuppressWarnings("rawtypes")
	private Map cardBrands;
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCapturedTotal() {
		return capturedTotal;
	}
	public void setCapturedTotal(String capturedTotal) {
		this.capturedTotal = capturedTotal;
	}
	public String getOpenPreauths() {
		return openPreauths;
	}
	public void setOpenPreauths(String openPreauths) {
		this.openPreauths = openPreauths;
	}
	@SuppressWarnings("rawtypes")
	public Map getCardBrands() {
		return cardBrands;
	}
	@SuppressWarnings("rawtypes")
	public void setCardBrands(Map cardBrands) {
		this.cardBrands = cardBrands;
	}
	
	

}
