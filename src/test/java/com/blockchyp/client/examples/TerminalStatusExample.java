package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TerminalStatusRequest;
import com.blockchyp.client.dto.TerminalStatusResponse;


public class TerminalStatusExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        TerminalStatusRequest request = new TerminalStatusRequest();
        request.setTerminalName("Test Terminal");

        TerminalStatusResponse response = client.terminalStatus(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    System.out.println(response.isIdle());
    System.out.println(response.getStatus());
    }


}
