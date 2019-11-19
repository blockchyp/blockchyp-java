package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.MessageRequest;

public class MessageTest {

    @Test
    @Category(IntegrationTest.class)
    public void testMessage() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        MessageRequest request = new MessageRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setMessage("Cayan is for bozos.");

        Acknowledgement response = client.message(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isSuccess());

    }

}
