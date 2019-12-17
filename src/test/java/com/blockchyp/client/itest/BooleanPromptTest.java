package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;

public class BooleanPromptTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         BooleanPromptRequest request = new BooleanPromptRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setPrompt("Would you like to become a member?");
         request.setYesCaption("Yes");
         request.setNoCaption("No");

         BooleanPromptResponse response = client.booleanPrompt(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());
         Assert.assertTrue(response.isResponse());

    }


}