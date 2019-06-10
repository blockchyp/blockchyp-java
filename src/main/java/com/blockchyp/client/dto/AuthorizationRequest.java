package com.blockchyp.client.dto;

import java.util.Map;

public class AuthorizationRequest extends PaymentRequest {
	
	private boolean enroll;
	private String description;
	private boolean promptForTip;
	
	@SuppressWarnings("rawtypes")
	private Map altPrices;
	public boolean isEnroll() {
		return enroll;
	}
	public void setEnroll(boolean enroll) {
		this.enroll = enroll;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPromptForTip() {
		return promptForTip;
	}
	public void setPromptForTip(boolean promptForTip) {
		this.promptForTip = promptForTip;
	}
	@SuppressWarnings("rawtypes")
	public Map getAltPrices() {
		return altPrices;
	}
	@SuppressWarnings("rawtypes")
	public void setAltPrices(Map altPrices) {
		this.altPrices = altPrices;
	}
	
	
	

}
