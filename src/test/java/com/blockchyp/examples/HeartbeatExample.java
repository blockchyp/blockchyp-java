package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.HeartbeatResponse;

public class HeartbeatExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void heartbeat(String terminalName, String amount) throws Exception {
        
        
        HeartbeatResponse response = blockchypClient.heartbeat(false);
        
        if (response.isSuccess()) {
            //the blockchyp gateway is up
        }
        
        if (response.getMerchantPk() != null) {
            //your gateway credentials are valid
        }
        
    }

}
