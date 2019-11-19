package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class EnrollExample {

    @Autowired
    private BlockChypClient blockchypClient;

    public void enroll(String terminalName, String amount) throws Exception {

        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef("your invoice or tender id");
        request.setTerminalName("Test Terminal");

        AuthorizationResponse response = blockchypClient.enroll(request);

        if (response.isApproved()) {
            System.out.println("Approved!");
        }

        String token = response.getToken(); //here's your token!



    }

}
