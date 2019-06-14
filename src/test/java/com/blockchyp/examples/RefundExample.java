package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.RefundRequest;

public class RefundExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void capture(String terminalName, String amount) throws Exception {
        
        RefundRequest request = new RefundRequest();
        request.setTransactionId("previous transaction id");
        request.setAmount("25.00"); //could be a reduced amount if it's a partial refund

        AuthorizationResponse response = blockchypClient.refund(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
        
    }

}
