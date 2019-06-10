package com.blockchyp.client.api;

import org.junit.Assert;
import org.junit.Test;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.HeartbeatResponse;

public class RestSanityTest {
    
    @Test
    public void testGatewayHeartbeat() throws Exception {
        
        BlockChypClient client = new BlockChypClient("https://api.blockchyp.com");  //no creds
        
        HeartbeatResponse response = client.heartbeat(false);
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isSuccess());
        Assert.assertNotNull(response.getTimestamp());
        Assert.assertNotNull(response.getLatestTick());
        
    }

}
