package com.blockchyp.client.itest;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class ChargeTest {

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
        request.setSigFile("sig.png");


        AuthorizationResponse response = client.charge(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());

        File file = new File("sig.png");
        Assert.assertTrue(file.exists());

    }

}
