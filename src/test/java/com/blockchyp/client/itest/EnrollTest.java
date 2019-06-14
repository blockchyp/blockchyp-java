package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class EnrollTest {
    
    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {
        
        
    	BlockChypClient client = IntegrationTestConfiguration.getTestClient();
        
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        
        AuthorizationResponse response = client.enroll(request);
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());
        Assert.assertNotNull(response.getToken());

        
    }

}
