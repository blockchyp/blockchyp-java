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
import com.blockchyp.client.dto.TermsAndConditionsLogRequest;
import com.blockchyp.client.dto.TermsAndConditionsLogResponse;
import com.blockchyp.client.dto.TermsAndConditionsRequest;
import com.blockchyp.client.dto.TermsAndConditionsResponse;
import com.blockchyp.client.dto.SignatureFormat;

public class TcLogTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        TermsAndConditionsRequest setupRequest = new TermsAndConditionsRequest();
        setupRequest.setTest(true);
        setupRequest.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        setupRequest.setTcName("HIPPA Disclosure");
        setupRequest.setTcContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ullamcorper id urna quis pulvinar. Pellentesque vestibulum justo ac nulla consectetur tristique. Suspendisse arcu arcu, viverra vel luctus non, dapibus vitae augue. Aenean ac volutpat purus. Curabitur in lacus nisi. Nam vel sagittis eros. Curabitur faucibus ut nisl in pulvinar. Nunc egestas, orci ut porttitor tempus, ante mauris pellentesque ex, nec feugiat purus arcu ac metus. Cras sodales ornare lobortis. Aenean lacinia ultricies purus quis pharetra. Cras vestibulum nulla et magna eleifend eleifend. Nunc nibh dolor, malesuada ut suscipit vitae, bibendum quis dolor. Phasellus ultricies ex vitae dolor malesuada, vel dignissim neque accumsan.");
        setupRequest.setSigFormat(SignatureFormat.PNG);
        setupRequest.setSigWidth(200);
        setupRequest.setSigRequired(true);

        TermsAndConditionsResponse setupResponse = client.termsAndConditions(setupRequest);


        // Set request parameters
        TermsAndConditionsLogRequest request = new TermsAndConditionsLogRequest();


        Exception ex = null;
        try {
            TermsAndConditionsLogResponse response = client.tcLog(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
