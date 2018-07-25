package com.blockchyp.client.itest;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.HeartbeatResponse;

public class AuthenticatedHeartbeatTest {
    
    @Test
    @Category(IntegrationTest.class)
    public void testHeartbeatApi() throws Exception {
        
        
        BlockChypClient client = new BlockChypClient(IntegrationTestConfiguration.getGatewayHost());  //no creds
        
        HeartbeatResponse response = client.heartbeat(IntegrationTestConfiguration.getTestCredentials());
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isSuccess());
        Assert.assertNotNull(response.getTimestamp());
        Assert.assertFalse(StringUtils.isEmpty(response.getMerchantPk()));
        Assert.assertNotNull(response.getLatestTick());
        
    }

}
