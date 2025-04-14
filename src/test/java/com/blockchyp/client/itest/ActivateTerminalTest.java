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
import com.blockchyp.client.dto.TerminalActivationRequest;
import com.blockchyp.client.dto.Acknowledgement;

public class ActivateTerminalTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        TerminalActivationRequest request = new TerminalActivationRequest();
        request.setTerminalName("Bad Terminal Code");
        request.setActivationCode("XXXXXX");

        Exception ex = null;
        try {
            Acknowledgement response = client.activateTerminal(request);
            // Response assertions
            Assert.assertFalse(response.isSuccess());
            Assert.assertEquals("Invalid Activation Code", response.getError());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
