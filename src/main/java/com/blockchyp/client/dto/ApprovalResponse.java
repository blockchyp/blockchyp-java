package com.blockchyp.client.dto;

public class ApprovalResponse extends CoreResponse {
	
	private boolean approved;
	private String authCode;
	private String sigFile;
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getSigFile() {
		return sigFile;
	}
	public void setSigFile(String sigFile) {
		this.sigFile = sigFile;
	}
	

}
