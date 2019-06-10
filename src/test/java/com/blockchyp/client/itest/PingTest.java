package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.PingRequest;

public class PingTest {
    
    @Test
    @Category(IntegrationTest.class)
    public void testTestApi() throws Exception {
        
        
        BlockChypClient client = IntegrationTestConfiguration.getTestClient();
        
        PingRequest request = new PingRequest();
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setTest(true);
        
        
        Acknowledgement ack = client.ping(request);
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
    }

}
