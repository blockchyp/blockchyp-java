/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
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
import com.blockchyp.client.dto.UploadMetadata;
import com.blockchyp.client.dto.MediaMetadata;

public class MediaUploadTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "MediaUploadTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        UploadMetadata request = new UploadMetadata();
        request.setFileName("aviato.png");
        request.setFileSize(18843);
        request.setUploadId(getUUID());

        MediaMetadata response = client.uploadMedia(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());
        Assert.assertNotNull(response.getId());
        Assert.assertTrue(response.getId().trim().length() > 0);
        Assert.assertEquals("aviato.png", response.getOriginalFile());
        Assert.assertNotNull(response.getFileUrl());
        Assert.assertTrue(response.getFileUrl().trim().length() > 0);
        Assert.assertNotNull(response.getThumbnailUrl());
        Assert.assertTrue(response.getThumbnailUrl().trim().length() > 0);

    }

}
