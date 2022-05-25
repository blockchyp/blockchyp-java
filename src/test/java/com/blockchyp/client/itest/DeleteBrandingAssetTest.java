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
import com.blockchyp.client.dto.BrandingAssetRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.BrandingAsset;

public class DeleteBrandingAssetTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "DeleteBrandingAssetTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        BrandingAsset setupRequest = new BrandingAsset();
        setupRequest.setNotes("Empty Asset");
        setupRequest.setEnabled(false);

         Acknowledgement setupResponse = client.updateBrandingAsset(setupRequest);

        // Set request parameters
        BrandingAssetRequest request = new BrandingAssetRequest();
        request.setAssetId();

        Acknowledgement response = client.deleteBrandingAsset(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}
