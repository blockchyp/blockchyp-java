package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.PingRequest;
import com.blockchyp.client.dto.PingResponse;

public class SimplePingTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         PingRequest request = new PingRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");

         PingResponse response = client.ping(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());

    }


}