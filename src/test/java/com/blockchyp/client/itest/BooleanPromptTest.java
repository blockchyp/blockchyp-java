package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;

public class BooleanPromptTest {
    
    @Test
    @Category(IntegrationTest.class)
    public void testPrompt() throws Exception {
        
        
    	BlockChypClient client = IntegrationTestConfiguration.getTestClient();
        
        BooleanPromptRequest request = new BooleanPromptRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setPrompt("Is OpenEdge slower than Christmas?");
        request.setYesCaption("ALWAYS");
        request.setNoCaption("MMM...");

        BooleanPromptResponse response = client.booleanPrompt(request);
        
        Assert.assertNotNull(response);
        Assert.assertTrue(response.isSuccess());
        Assert.assertTrue(response.isResponse());
        
    }

}
