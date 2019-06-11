package com.blockchyp.client.dto;

public class MessageRequest extends CoreRequest implements ITerminalReference {
	
	private String terminalName;
	private String message;
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
