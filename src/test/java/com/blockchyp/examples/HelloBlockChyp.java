package com.blockchyp.examples;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.APICredentials;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class HelloBlockChyp {


    public static void main(String[] args) throws Exception {


        APICredentials creds = new APICredentials("APIKEY", "BEARER TOKEN", "SIGNING_KEY");

        BlockChypClient client = new BlockChypClient(creds);

        AuthorizationRequest request = new AuthorizationRequest();
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");


        AuthorizationResponse response = client.charge(request);

        if (response.isApproved()) {
            System.out.println("Approved!  Auth Code: " + response.getAuthCode());
        }


    }

}
