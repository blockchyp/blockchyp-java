package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.PingRequest;

public class PingExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void heartbeat(String terminalName, String amount) throws Exception {
        
        PingRequest request = new PingRequest();
        request.setTerminalName("Test Terminal");
        
        
        Acknowledgement ack = blockchypClient.ping(request);
        
        if (ack.isSuccess()) {
            //the terminal is up and accessible!
        }
        

        
    }

}
