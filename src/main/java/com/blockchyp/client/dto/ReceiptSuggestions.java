package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReceiptSuggestions {
    
    private String aid;
    
    private String maskedPan;
    
    private String transactionCertificate;
    
    private String arqc;

    @JsonProperty("AID")
    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    @JsonProperty("PAN")
    public String getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(String maskedPan) {
        this.maskedPan = maskedPan;
    }

    @JsonProperty("TC")
    public String getTransactionCertificate() {
        return transactionCertificate;
    }

    public void setTransactionCertificate(String transactionCertificate) {
        this.transactionCertificate = transactionCertificate;
    }

    @JsonProperty("ARQC")
    public String getArqc() {
        return arqc;
    }

    public void setArqc(String arqc) {
        this.arqc = arqc;
    }
    
    

}
