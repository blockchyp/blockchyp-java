package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.ClearTerminalRequest;
import com.blockchyp.client.dto.Acknowledgement;

public class TerminalClearTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         ClearTerminalRequest request = new ClearTerminalRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");

         Acknowledgement response = client.clear(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());

    }


}