package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiptSuggestions {
    
	
    private String aid;
    
    private String arqc;
    
    private String iad;
    
    private String arc;
    
    private String tc;
    
    private String tsi;
    
    private String terminalId;
    
    private String merchantName;
    
    private String merchantKey;
    
    private String applicationLabel;
    
    private boolean requestSignature;
    
    private String maskedPan;
    
    private String authorizedAmount;
    
    private String transactionType;
    
    private String entryMethod;
    

    @JsonProperty("IAD")
    public String getIad() {
		return iad;
	}

	public void setIad(String iad) {
		this.iad = iad;
	}
	
	
	@JsonProperty("ARC")
	public String getArc() {
		return arc;
	}

	public void setArc(String arc) {
		this.arc = arc;
	}

	@JsonProperty("TSI")
	public String getTsi() {
		return tsi;
	}

	public void setTsi(String tsi) {
		this.tsi = tsi;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantKey() {
		return merchantKey;
	}

	public void setMerchantKey(String merchantKey) {
		this.merchantKey = merchantKey;
	}

	public String getApplicationLabel() {
		return applicationLabel;
	}

	public void setApplicationLabel(String applicationLabel) {
		this.applicationLabel = applicationLabel;
	}

	public boolean isRequestSignature() {
		return requestSignature;
	}

	public void setRequestSignature(boolean requestSignature) {
		this.requestSignature = requestSignature;
	}

	public String getAuthorizedAmount() {
		return authorizedAmount;
	}

	public void setAuthorizedAmount(String authorizedAmount) {
		this.authorizedAmount = authorizedAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getEntryMethod() {
		return entryMethod;
	}

	public void setEntryMethod(String entryMethod) {
		this.entryMethod = entryMethod;
	}

	@JsonProperty("AID")
    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    @JsonProperty("TC")
    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    @JsonProperty("ARQC")
    public String getArqc() {
        return arqc;
    }

    public void setArqc(String arqc) {
        this.arqc = arqc;
    }
    
    

}
