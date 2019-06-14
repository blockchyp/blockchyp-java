package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.CloseBatchRequest;
import com.blockchyp.client.dto.CloseBatchResponse;

public class CloseBatchExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void closeBatch(String terminalName, String amount) throws Exception {
        
        CloseBatchRequest request = new CloseBatchRequest();

        CloseBatchResponse response = blockchypClient.closeBatch(request);
        
        if (response.isSuccess()) {
            System.out.println("Batch closed successfully!");
            System.out.println(response.getCapturedTotal()); //the amount of the expected deposit
            System.out.println(response.getOpenPreauths()); //the total of preauths opened during the batch that weren't captured
        }
        
    }

}