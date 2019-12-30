package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;


public class PreauthExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setAmount("27.00");

        AuthorizationResponse response = client.preauth(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    System.out.println(response.getAuthCode());
    System.out.println(response.getAuthorizedAmount());
    }


}