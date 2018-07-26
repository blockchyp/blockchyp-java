package com.blockchyp.client.dto;

import com.blockchyp.client.GatewayCredentials;

public class ChargeRequest extends TerminalRequest {
    
    
    private String amount;
    private String description;

    public ChargeRequest() {
        super();
    }
    public ChargeRequest(GatewayCredentials creds) {
        super(creds);
    }
    
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    

}
