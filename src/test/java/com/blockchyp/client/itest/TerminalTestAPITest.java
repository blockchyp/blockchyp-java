package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;

public class TerminalTestAPITest {
    
    @Test
    @Category(IntegrationTest.class)
    public void testTestApi() throws Exception {
        
        
        BlockChypClient client = new BlockChypClient(IntegrationTestConfiguration.getGatewayHost());  //no creds
        
        Acknowledgement ack = client.test(IntegrationTestConfiguration.getDefaultTerminalName(), IntegrationTestConfiguration.getTestCredentials());
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
    }

}
