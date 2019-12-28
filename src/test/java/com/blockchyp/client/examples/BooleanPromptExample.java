package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;


public class BooleanPromptExample {

  public void runSampleTransaction() throws Exception {

    APICredentials creds = new APICredentials();
    creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
    creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
    creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

    BlockChypClient client = new BlockChypClient(creds);

    // setup request object
    BooleanPromptRequest request = new BooleanPromptRequest();
    request.setTest(true);
    request.setTerminalName("Test Terminal");
    request.setPrompt("Would you like to become a member?");
    request.setYesCaption("Yes");
    request.setNoCaption("No");

    BooleanPromptResponse response = client.booleanPrompt(request);

    //process the result
    
    if (response.isSuccess()) {
      System.out.println("Success");
    }

    System.out.println(response.isResponse());
  }


}