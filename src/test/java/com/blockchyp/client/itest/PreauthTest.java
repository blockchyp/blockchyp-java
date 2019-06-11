package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;

public class PreauthTest {
    
    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {
        
        
    	BlockChypClient client = IntegrationTestConfiguration.getTestClient();
        
        AuthorizationRequest request = new AuthorizationRequest();
        request.setAmount("55.55");
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setSigFormat("png");
        request.setSigWidth(200);

        
        AuthorizationResponse response = client.preauth(request);
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());
        
        CaptureRequest captureRequest = new CaptureRequest();
        captureRequest.setTransactionId(response.getTransactionId());
        captureRequest.setTest(response.isTest());
        
        CaptureResponse captureResponse = client.capture(captureRequest);
        
        Assert.assertNotNull(captureResponse);
        Assert.assertTrue(captureResponse.isApproved());
        

        
    }

}
