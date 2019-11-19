package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class KeyedEntryExample {

    @Autowired
    private BlockChypClient blockchypClient;

    public void charge(String terminalName, String amount) throws Exception {

        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef("your invoice or tender id");
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");
        request.setManualEntry(true);

        AuthorizationResponse response = blockchypClient.charge(request);

        if (response.isApproved()) {
            System.out.println("Approved!");
        }

        String txId = response.getTransactionId(); //store this for refunding or voiding later



    }

}
