package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TermsAndConditionsRequest;
import com.blockchyp.client.dto.TermsAndConditionsResponse;


public class TCExample {

  public void runSampleTransaction() throws Exception {

    APICredentials creds = new APICredentials();
    creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
    creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
    creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

    BlockChypClient client = new BlockChypClient(creds);

    // setup request object
    TermsAndConditionsRequest request = new TermsAndConditionsRequest();
    request.setTest(true);
    request.setTerminalName("Test Terminal");
    request.setTCAlias("hippa");// Alias for a T&C template configured in blockchyp
    request.setTCName("HIPPA Disclosure");// Name of the contract or document if not using an alias
    request.setTCContent("Full contract text");// Full text of the contract or disclosure if not using an alias
    request.setSigFormat("png");// file format for the signature image, if desired can be PNG or JPG
    request.setSigWidth(200);// width of the signature image in pixels
    request.setSigRequired(true);// Whether or not a signature is required.  Defaults to true.

    TermsAndConditionsResponse response = client.tc(request);

    //process the result
    
    if (response.isSuccess()) {
      System.out.println("Success");
    }

    System.out.println(response.getSig());
    System.out.println(response.getSigFile());
  }


}