package com.blockchyp.client.dto;

public class BooleanPromptResponse extends Acknowledgement {
	
	private boolean response;

	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}
	
	

}
