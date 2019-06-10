package com.blockchyp.client.dto;

public class AuthorizationResponse extends ApprovalResponseWithPaymentMethod {
	
	private boolean storeAndForward;

	public boolean isStoreAndForward() {
		return storeAndForward;
	}

	public void setStoreAndForward(boolean storeAndForward) {
		this.storeAndForward = storeAndForward;
	}
	
	
	

}
