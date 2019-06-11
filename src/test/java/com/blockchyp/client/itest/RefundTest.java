package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.RefundRequest;

public class RefundTest {
    
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

        
        AuthorizationResponse response = client.charge(request);
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());
        
        RefundRequest refundRequest = new RefundRequest();
        refundRequest.setTransactionId(response.getTransactionId());
        refundRequest.setTest(response.isTest());
        
        AuthorizationResponse refundResponse = client.refund(refundRequest);
        
        Assert.assertNotNull(refundRequest);
        Assert.assertTrue(refundResponse.isApproved());
        

        
    }

}
