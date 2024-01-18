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
import com.blockchyp.client.dto.SlideShow;
import com.blockchyp.client.dto.Slide;
import com.blockchyp.client.dto.UploadMetadata;
import com.blockchyp.client.dto.MediaMetadata;

public class UpdateSlideShowTest extends BaseTestCase {

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
        SlideShow request = new SlideShow();
        request.setName("Test Slide Show");
        request.setDelay(5);

        Collection slides = new ArrayList();
        Slide slides0 = new Slide();
        slides0.setMediaId(setupResponse.getId());
        slides.add(slides0);
        request.setSlides(slides);

        Exception ex = null;
        try {
            SlideShow response = client.updateSlideShow(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("Test Slide Show", response.getName());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
