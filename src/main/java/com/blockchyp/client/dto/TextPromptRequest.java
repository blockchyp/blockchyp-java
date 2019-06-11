package com.blockchyp.client.dto;

public class TextPromptRequest extends CoreRequest implements ITerminalReference {
	
	private String terminalName;
	private String promptType;
	
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getPromptType() {
		return promptType;
	}
	public void setPromptType(String promptType) {
		this.promptType = promptType;
	}

}
