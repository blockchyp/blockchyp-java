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
import com.blockchyp.client.dto.TextPromptRequest;
import com.blockchyp.client.dto.TextPromptResponse;

public class TextPromptTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         TextPromptRequest request = new TextPromptRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setPromptType("email");

         TextPromptResponse response = client.textPrompt(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());
         Assert.assertNotNull(response.getResponse());
         Assert.assertTrue(response.getResponse().trim().length() > 0);

    }


}
