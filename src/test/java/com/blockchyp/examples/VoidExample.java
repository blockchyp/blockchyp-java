package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.VoidRequest;
import com.blockchyp.client.dto.VoidResponse;

public class VoidExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void voidTx(String terminalName, String amount) throws Exception {
        
        VoidRequest request = new VoidRequest();
        request.setTransactionId("previous transaction id");

        VoidResponse response = blockchypClient.voidTx(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
        
    }

}
