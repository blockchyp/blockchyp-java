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
import com.blockchyp.client.dto.CaptureSignatureRequest;
import com.blockchyp.client.dto.CaptureSignatureResponse;
import com.blockchyp.client.dto.SignatureFormat;

public class CaptureSignatureTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "CaptureSignatureTest");

        // setup request object
        CaptureSignatureRequest request = new CaptureSignatureRequest();
        request.setTerminalName("Test Terminal");
        request.setSigFormat(SignatureFormat.PNG);
        request.setSigWidth(200);

        CaptureSignatureResponse response = client.captureSignature(request);

        // response assertions
        Assert.assertTrue(response.isSuccess());

    }


}
