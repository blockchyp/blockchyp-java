package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class SpringExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public boolean charge(String terminalName, String amount) throws Exception {
        
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");
        
        
        AuthorizationResponse response = blockchypClient.charge(request);
        
        return response.isApproved();
        
    }

}
