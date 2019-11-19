package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;

public class BooleanPromptExample {

    @Autowired
    private BlockChypClient blockchypClient;

    public void booleanPrompt(String terminalName, String amount) throws Exception {

        BooleanPromptRequest request = new BooleanPromptRequest();
        request.setTerminalName("Test Terminal");
        request.setPrompt("Is Game of Thrones overrated?");

        BooleanPromptResponse response = blockchypClient.booleanPrompt(request);

        if (response.isResponse()) {
            // Well, at least Josiah agrees with you.
        } else {
            // Night gathers, and now your watch begins.
        }

    }

}
