/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.TermsAndConditionsLogRequest;
import com.blockchyp.client.dto.TermsAndConditionsLogEntry;
import com.blockchyp.client.dto.TermsAndConditionsLogResponse;

public class TcEntryTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        TermsAndConditionsLogRequest setupRequest = new TermsAndConditionsLogRequest();


        TermsAndConditionsLogResponse setupResponse = client.tcLog(setupRequest);


        // Set request parameters
        TermsAndConditionsLogRequest request = new TermsAndConditionsLogRequest();
        request.setLogEntryId(setupResponse.getResults().iterator().next().getId());

        Exception ex = null;
        try {
            TermsAndConditionsLogEntry response = client.tcEntry(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
            Assert.assertNotNull(response.getId());
            Assert.assertTrue(response.getId().trim().length() > 0);
            Assert.assertNotNull(response.getTerminalId());
            Assert.assertTrue(response.getTerminalId().trim().length() > 0);
            Assert.assertNotNull(response.getTerminalName());
            Assert.assertTrue(response.getTerminalName().trim().length() > 0);
            Assert.assertNotNull(response.getTimestamp());
            Assert.assertTrue(response.getTimestamp().trim().length() > 0);
            Assert.assertNotNull(response.getName());
            Assert.assertTrue(response.getName().trim().length() > 0);
            Assert.assertNotNull(response.getContent());
            Assert.assertTrue(response.getContent().trim().length() > 0);
            Assert.assertTrue(response.isHasSignature());
            Assert.assertNotNull(response.getSignature());
            Assert.assertTrue(response.getSignature().trim().length() > 0);
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
