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
import com.blockchyp.client.dto.SurveyQuestion;

public class UpdateSurveyQuestionTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "UpdateSurveyQuestionTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        SurveyQuestion request = new SurveyQuestion();
        request.setOrdinal(1);
        request.setQuestionText("Would you shop here again?");
        request.setQuestionType("yes_no");

        SurveyQuestion response = client.updateSurveyQuestion(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());
        Assert.assertEquals("Would you shop here again?", response.getQuestionText());
        Assert.assertEquals("yes_no", response.getQuestionType());

    }

}
