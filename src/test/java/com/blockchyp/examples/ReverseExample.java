package com.blockchyp.examples;

import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class ReverseExample {

    @Autowired
    private BlockChypClient blockchypClient;

    public void reverse(String terminalName, String amount) throws Exception {

        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef("your invoice or tender id");
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");

        try {
            AuthorizationResponse response = blockchypClient.charge(request);

            if (response.isApproved()) {
                System.out.println("Approved!");
            }
        } catch (TimeoutException te) {
            //nope
            AuthorizationResponse response = blockchypClient.reverse(request);

           if (response.isApproved()) {
               //blockchyp authorized the transaction the first time
               //but it's now been reversed
           } else {
               //blockchyp never recieved the transaction
           }
        }

    }

}
