/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;


import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.DeleteTokenRequest;
import com.blockchyp.client.dto.DeleteTokenResponse;
import com.blockchyp.client.dto.EnrollRequest;
import com.blockchyp.client.dto.EnrollResponse;

public class DeleteTokenTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "DeleteTokenTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        EnrollRequest setupRequest = new EnrollRequest();
        setupRequest.setPan("4111111111111111");
        setupRequest.setTest(true);

         EnrollResponse setupResponse = client.enroll(setupRequest);

        // Set request parameters
        DeleteTokenRequest request = new DeleteTokenRequest();
        request.setToken(setupResponse.getToken());

        DeleteTokenResponse response = client.deleteToken(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}
