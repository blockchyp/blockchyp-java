package com.blockchyp.client.dto;

public class PingRequest extends CoreRequest implements ITerminalReference {
	
	private String terminalName;

	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	
	

}
