package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TextPromptRequest;
import com.blockchyp.client.dto.TextPromptResponse;

public class TextPromptExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void textPrompt(String terminalName, String amount) throws Exception {
        
        TextPromptRequest request = new TextPromptRequest();
        request.setTerminalName("Test Terminal");
        
        //must be one of: "email", "phone", "customer-number", or "rewards-number"
        request.setPromptType("email");

        TextPromptResponse response = blockchypClient.textPrompt(request);
        
        if (response.isSuccess()) {
            System.out.println("The user's email is " + response.getResponse());
        } 
        
    }

}
