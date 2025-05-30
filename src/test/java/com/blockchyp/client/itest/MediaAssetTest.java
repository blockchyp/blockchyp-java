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
import com.blockchyp.client.dto.MediaRequest;
import com.blockchyp.client.dto.MediaMetadata;
import com.blockchyp.client.dto.UploadMetadata;

public class MediaAssetTest extends BaseTestCase {

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
        MediaRequest request = new MediaRequest();
        request.setMediaId(setupResponse.getId());

        Exception ex = null;
        try {
            MediaMetadata response = client.mediaAsset(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
            Assert.assertNotNull(response.getId());
            Assert.assertTrue(response.getId().trim().length() > 0);
            Assert.assertEquals("aviato.png", response.getOriginalFile());
            Assert.assertNotNull(response.getFileUrl());
            Assert.assertTrue(response.getFileUrl().trim().length() > 0);
            Assert.assertNotNull(response.getThumbnailUrl());
            Assert.assertTrue(response.getThumbnailUrl().trim().length() > 0);
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
