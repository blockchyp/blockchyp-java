package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.CloseBatchRequest;
import com.blockchyp.client.dto.CloseBatchResponse;

public class BatchCloseTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        AuthorizationRequest request = new AuthorizationRequest();
        request.setAmount("123.45");
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setSigFormat("png");
        request.setSigWidth(200);


        AuthorizationResponse response = client.charge(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());

        CloseBatchRequest closeRequest = new CloseBatchRequest();


        CloseBatchResponse closeResponse = client.closeBatch(closeRequest);

        Assert.assertNotNull(closeResponse);
        Assert.assertTrue(closeResponse.isSuccess());



    }

}
