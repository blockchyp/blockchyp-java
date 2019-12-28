package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class SimpleCaptureTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();


	     // setup request object
         AuthorizationRequest setupRequest = new AuthorizationRequest();
    
         setupRequest.setPAN("4111111111111111");
    
         setupRequest.setAmount("25.55");
    
         setupRequest.setTest(true);
    
         AuthorizationResponse setupResponse = client.preauth(setupRequest);



         // setup request object
         CaptureRequest request = new CaptureRequest();
         request.setTransactionID(setupResponse.getTransactionID());
         request.setTest(true);

         CaptureResponse response = client.capture(request);


         // response assertions
         Assert.assertTrue(response.isApproved());

    }


}