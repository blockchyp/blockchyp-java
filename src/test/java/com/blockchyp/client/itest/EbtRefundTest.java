package com.blockchyp.client.itest;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.RefundRequest;
import com.blockchyp.client.dto.CardType;

public class EbtRefundTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        AuthorizationRequest chargeRequest = new AuthorizationRequest();
        chargeRequest.setAmount("1.02");
        chargeRequest.setTest(true);
        chargeRequest.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        chargeRequest.setCardType(CardType.EBT);

        AuthorizationResponse chargeResponse = client.charge(chargeRequest);

        Assert.assertNotNull(chargeResponse);
        Assert.assertTrue(chargeResponse.isApproved());

        RefundRequest refundRequest = new RefundRequest();
        refundRequest.setTransactionId(chargeResponse.getTransactionId());
        refundRequest.setTest(true);

        AuthorizationResponse refundResponse = client.refund(refundRequest);

        Assert.assertNotNull(refundResponse);
        Assert.assertTrue(refundResponse.isApproved());

    }

}
