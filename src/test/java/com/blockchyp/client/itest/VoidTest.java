package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.VoidRequest;
import com.blockchyp.client.dto.VoidResponse;

public class VoidTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        AuthorizationRequest request = new AuthorizationRequest();
        request.setAmount("55.55");
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setSigFormat("png");
        request.setSigWidth(200);


        AuthorizationResponse response = client.charge(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());

        VoidRequest voidRequest = new VoidRequest();
        voidRequest.setTransactionId(response.getTransactionId());
        voidRequest.setTest(response.isTest());

        VoidResponse voidResponse = client.voidTx(voidRequest);

        Assert.assertNotNull(voidResponse);
        Assert.assertTrue(voidResponse.isApproved());



    }

}
