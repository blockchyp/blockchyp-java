package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class PanChargeTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         AuthorizationRequest request = new AuthorizationRequest();
         request.setPAN("4111111111111111");
         request.setAmount("25.55");
         request.setTest(true);

         AuthorizationResponse response = client.charge(request);


         // response assertions
         Assert.assertTrue(response.isApproved());
         Assert.assertTrue(response.isTest());
         Assert.assertTrue(response.getAuthCode().length() == 6);
         Assert.assertNotNull(response.getTransactionID());
         Assert.assertTrue(response.getTransactionID().trim().length() > 0);
         Assert.assertNotNull(response.getTimestamp());
         Assert.assertTrue(response.getTimestamp().trim().length() > 0);
         Assert.assertNotNull(response.getTickBlock());
         Assert.assertTrue(response.getTickBlock().trim().length() > 0);
         Assert.assertEquals("Approved", response.getResponseDescription());
         Assert.assertNotNull(response.getPaymentType());
         Assert.assertTrue(response.getPaymentType().trim().length() > 0);
         Assert.assertNotNull(response.getMaskedPAN());
         Assert.assertTrue(response.getMaskedPAN().trim().length() > 0);
         Assert.assertNotNull(response.getEntryMethod());
         Assert.assertTrue(response.getEntryMethod().trim().length() > 0);
         Assert.assertEquals("25.55", response.getAuthorizedAmount());
         Assert.assertEquals("KEYED", response.getEntryMethod());

    }


}