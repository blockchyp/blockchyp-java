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
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;

public class BooleanPromptTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "BooleanPromptTest");

        // Set request parameters
        BooleanPromptRequest request = new BooleanPromptRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setPrompt("Would you like to become a member?");
        request.setYesCaption("Yes");
        request.setNoCaption("No");

        BooleanPromptResponse response = client.booleanPrompt(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());
        Assert.assertTrue(response.isResponse());

    }

}
