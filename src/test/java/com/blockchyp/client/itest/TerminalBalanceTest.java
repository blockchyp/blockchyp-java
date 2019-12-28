package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.BalanceRequest;
import com.blockchyp.client.dto.BalanceResponse;

public class TerminalBalanceTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         BalanceRequest request = new BalanceRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setCardType(3);

         BalanceResponse response = client.balance(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());
         Assert.assertNotNull(response.getRemainingBalance());
         Assert.assertTrue(response.getRemainingBalance().trim().length() > 0);

    }


}