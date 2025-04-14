/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.itest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.BalanceRequest;
import com.blockchyp.client.dto.BalanceResponse;
import com.blockchyp.client.dto.CardType;

public class TerminalEbtBalanceTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");


        processTestDelay(IntegrationTestConfiguration.getTestClient(), "TerminalEBTBalanceTest", IntegrationTestConfiguration.getDefaultTerminalName());
        
        // Set request parameters
        BalanceRequest request = new BalanceRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setCardType(CardType.EBT);

        Exception ex = null;
        try {
            BalanceResponse response = client.balance(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
            Assert.assertNotNull(response.getRemainingBalance());
            Assert.assertTrue(response.getRemainingBalance().trim().length() > 0);
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
