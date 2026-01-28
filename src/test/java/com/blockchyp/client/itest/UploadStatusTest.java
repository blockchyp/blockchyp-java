/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.UploadStatusRequest;
import com.blockchyp.client.dto.UploadStatus;
import com.blockchyp.client.dto.UploadMetadata;
import com.blockchyp.client.dto.MediaMetadata;

public class UploadStatusTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        UploadMetadata setupRequest = new UploadMetadata();
        setupRequest.setFileName("aviato.png");
        setupRequest.setFileSize(18843);
        setupRequest.setUploadId(getUUID());

        InputStream inStream = this.getClass().getClassLoader().getResourceAsStream("aviato.png");
        MediaMetadata setupResponse = client.uploadMedia(setupRequest, inStream);



        // Set request parameters
        UploadStatusRequest request = new UploadStatusRequest();
        request.setUploadId(setupRequest.getUploadId());

        Exception ex = null;
        try {
            UploadStatus response = client.uploadStatus(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
