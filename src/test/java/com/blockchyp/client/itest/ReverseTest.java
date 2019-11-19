package com.blockchyp.client.itest;

import java.util.Random;

import org.apache.commons.codec.binary.Base32;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class ReverseTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {


        byte[] refBytes = new byte[16];
        new Random().nextBytes(refBytes);

        Base32 base32 = new Base32();
        String txRef = base32.encodeToString(refBytes);



        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        AuthorizationRequest request = new AuthorizationRequest();
        request.setAmount("55.55");
        request.setTest(true);
        request.setTransactionRef(txRef);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());


        AuthorizationResponse response = client.charge(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());

        request.setTerminalName(null);
        response = client.reverse(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());


    }

}
