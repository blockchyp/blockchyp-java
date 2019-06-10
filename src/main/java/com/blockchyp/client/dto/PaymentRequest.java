package com.blockchyp.client.dto;

public class PaymentRequest extends AmountRequest implements ITerminalReference {
	
	private String terminalName;
	private String token;
	private String track1;
	private String track2;
	private String pan;
	private String routingNumber;
	private String cardholderName;
	private String expMonth;
	private String expYear;
	private String cvv;
	private String address;
	private String postalCode;
	private boolean manualEntry;
	private String sigFormat;
	private int sigWidth;
	
	
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTrack1() {
		return track1;
	}
	public void setTrack1(String track1) {
		this.track1 = track1;
	}
	public String getTrack2() {
		return track2;
	}
	public void setTrack2(String track2) {
		this.track2 = track2;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getCardholderName() {
		return cardholderName;
	}
	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}
	public String getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}
	public String getExpYear() {
		return expYear;
	}
	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public boolean isManualEntry() {
		return manualEntry;
	}
	public void setManualEntry(boolean manualEntry) {
		this.manualEntry = manualEntry;
	}
	public String getSigFormat() {
		return sigFormat;
	}
	public void setSigFormat(String sigFormat) {
		this.sigFormat = sigFormat;
	}
	public int getSigWidth() {
		return sigWidth;
	}
	public void setSigWidth(int sigWidth) {
		this.sigWidth = sigWidth;
	}


}
