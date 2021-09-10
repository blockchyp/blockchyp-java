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

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class TerminalTimeoutTest extends BaseTestCase {

    @Test(expected = java.io.IOException.class)
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "TerminalTimeoutTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTimeout(1);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setAmount("25.15");
        request.setTest(true);

        AuthorizationResponse response = client.charge(request);

        // Response assertions

    }

}
