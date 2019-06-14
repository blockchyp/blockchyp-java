package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.MessageRequest;

public class MessageExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void message() throws Exception {
        
        MessageRequest request = new MessageRequest();
        request.setTerminalName("Test Terminal");
        request.setMessage("Something derogatory about about Verifone.");

        Acknowledgement ack = blockchypClient.message(request);
        
        if (ack.isSuccess()) {
            System.out.println("The truth is now out there.");
        }
        
    }

}
