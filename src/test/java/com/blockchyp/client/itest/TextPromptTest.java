package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TextPromptRequest;
import com.blockchyp.client.dto.TextPromptResponse;

public class TextPromptTest {

    @Test
    @Category(IntegrationTest.class)
    public void testPrompt() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        TextPromptRequest request = new TextPromptRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setPromptType("email");


        TextPromptResponse response = client.textPrompt(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isSuccess());
        Assert.assertNotNull(response.getResponse());

    }

}
