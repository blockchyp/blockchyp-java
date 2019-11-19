package com.blockchyp.client.itest;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.BalanceResponse;
import com.blockchyp.client.dto.CardType;

public class EbtBalanceTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        AuthorizationRequest request = new AuthorizationRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setCardType(CardType.EBT);


        BalanceResponse response = client.balance(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isSuccess());

    }

}
