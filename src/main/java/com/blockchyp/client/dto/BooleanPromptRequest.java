package com.blockchyp.client.dto;

public class BooleanPromptRequest extends CoreRequest implements ITerminalReference {
	
	private String terminalName;
	private String prompt;
	private String yesCaption;
	private String noCaption;
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public String getYesCaption() {
		return yesCaption;
	}
	public void setYesCaption(String yesCaption) {
		this.yesCaption = yesCaption;
	}
	public String getNoCaption() {
		return noCaption;
	}
	public void setNoCaption(String noCaption) {
		this.noCaption = noCaption;
	}
	
	

}
