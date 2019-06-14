package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;

public class CaptureExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void capture(String terminalName, String amount) throws Exception {
        
        CaptureRequest request = new CaptureRequest();
        request.setTransactionId("previous transaction id");
        request.setTipAmount("5.00"); //optional tip amount
        request.setAmount("55.00"); //total including the tip

        CaptureResponse response = blockchypClient.capture(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
        
    }

}
