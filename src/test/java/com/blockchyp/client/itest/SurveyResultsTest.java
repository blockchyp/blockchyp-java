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
import com.blockchyp.client.dto.SurveyResultsRequest;
import com.blockchyp.client.dto.SurveyQuestion;
import com.blockchyp.client.dto.SurveyQuestionRequest;
import com.blockchyp.client.dto.SurveyQuestionResponse;

public class SurveyResultsTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "SurveyResultsTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        SurveyQuestionRequest setupRequest = new SurveyQuestionRequest();


         SurveyQuestionResponse setupResponse = client.surveyQuestions(setupRequest);

        // Set request parameters
        SurveyResultsRequest request = new SurveyResultsRequest();


        SurveyQuestion response = client.surveyResults(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}
