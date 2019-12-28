package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.MessageRequest;
import com.blockchyp.client.dto.Acknowledgement;

public class SimpleMessageTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         MessageRequest request = new MessageRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setMessage("Thank You For Your Business");

         Acknowledgement response = client.message(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());

    }


}