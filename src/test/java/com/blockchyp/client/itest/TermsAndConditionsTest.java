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
import com.blockchyp.client.dto.TermsAndConditionsRequest;
import com.blockchyp.client.dto.TermsAndConditionsResponse;
import com.blockchyp.client.dto.SignatureFormat;

public class TermsAndConditionsTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();

         processTestDelay(client, "TermsAndConditionsTest");



         // setup request object
         TermsAndConditionsRequest request = new TermsAndConditionsRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setTcName("HIPPA Disclosure");
         request.setTcContent("Full contract text");
         request.setSigFormat(SignatureFormat.PNG);
         request.setSigWidth(200);
         request.setSigRequired(true);

         TermsAndConditionsResponse response = client.termsAndConditions(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());

    }


}
