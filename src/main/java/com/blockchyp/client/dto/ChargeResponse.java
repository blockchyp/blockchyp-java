package com.blockchyp.client.dto;

public class ChargeResponse extends Acknowledgement {
    
    private String id;
    private boolean approved;
    private String authCode;
    private String amount;
    private String entryMethod;
    private String paymentType;
    private String transactionId;
    private String token;
    private ReceiptSuggestions receiptSuggestions;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getEntryMethod() {
        return entryMethod;
    }
    public void setEntryMethod(String entryMethod) {
        this.entryMethod = entryMethod;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public ReceiptSuggestions getReceiptSuggestions() {
        return receiptSuggestions;
    }
    public void setReceiptSuggestions(ReceiptSuggestions receiptSuggestions) {
        this.receiptSuggestions = receiptSuggestions;
    }
    
    
    

}
