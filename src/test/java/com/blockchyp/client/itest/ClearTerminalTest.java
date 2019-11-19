package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.ClearTerminalRequest;

public class ClearTerminalTest {


    @Test
    @Category(IntegrationTest.class)
    public void testClearTerminal() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        ClearTerminalRequest clearRequest = new ClearTerminalRequest();
        clearRequest.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        clearRequest.setTest(true);

        Acknowledgement ack = client.clear(clearRequest);

        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());


    }

}
