package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.ChargeRequest;
import com.blockchyp.client.dto.ChargeResponse;

public class ChargeTest {
    
    @Test
    @Category(IntegrationTest.class)
    public void testTestApi() throws Exception {
        
        
        BlockChypClient client = new BlockChypClient(IntegrationTestConfiguration.getGatewayHost());  //no creds
        
        ChargeRequest request = new ChargeRequest(IntegrationTestConfiguration.getTestCredentials());
        request.setAmount("55.55");
        
        ChargeResponse response = client.charge(IntegrationTestConfiguration.getDefaultTerminalName(), request);
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isSuccess());
        Assert.assertTrue(response.isApproved());
        
    }

}
