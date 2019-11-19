package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class ManualChargeTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        AuthorizationRequest request = new AuthorizationRequest();
        request.setAmount("12.13");
        request.setTest(true);
        request.setManualEntry(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());


        AuthorizationResponse response = client.charge(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());

    }

}
