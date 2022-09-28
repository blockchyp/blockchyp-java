/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.TermsAndConditionsTemplateRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.TermsAndConditionsTemplate;

public class TcDeleteTemplateTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        TermsAndConditionsTemplate setupRequest = new TermsAndConditionsTemplate();
        setupRequest.setAlias(getUUID());
        setupRequest.setName("HIPPA Disclosure");
        setupRequest.setContent("Lorem ipsum dolor sit amet.");

        TermsAndConditionsTemplate setupResponse = client.tcUpdateTemplate(setupRequest);


        // Set request parameters
        TermsAndConditionsTemplateRequest request = new TermsAndConditionsTemplateRequest();
        request.setTemplateId(setupResponse.getId());

        Exception ex = null;
        try {
            Acknowledgement response = client.tcDeleteTemplate(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
