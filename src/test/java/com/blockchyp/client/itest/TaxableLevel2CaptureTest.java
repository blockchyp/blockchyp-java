package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;

public class TaxableLevel2CaptureTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {


        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        AuthorizationRequest request = new AuthorizationRequest();
        request.setAmount("15.00");
        request.setTest(true);
        request.setTaxExempt(false);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());



        AuthorizationResponse response = client.preauth(request);

        Assert.assertNotNull(response);
        Assert.assertTrue(response.isApproved());


        CaptureRequest captureRequest = new CaptureRequest();
        captureRequest.setAmount("24.00");
        captureRequest.setTaxAmount("3.00");
        captureRequest.setTransactionId(response.getTransactionId());

        CaptureResponse captureResponse = client.capture(captureRequest);

        Assert.assertNotNull(captureResponse);
        Assert.assertTrue(response.isApproved());


    }

}
