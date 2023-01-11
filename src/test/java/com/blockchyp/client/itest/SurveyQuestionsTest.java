/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.SurveyQuestionRequest;
import com.blockchyp.client.dto.SurveyQuestionResponse;
import com.blockchyp.client.dto.SurveyQuestion;

public class SurveyQuestionsTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        SurveyQuestion setupRequest = new SurveyQuestion();
        setupRequest.setOrdinal(1);
        setupRequest.setQuestionText("Would you shop here again?");
        setupRequest.setQuestionType("yes_no");

        SurveyQuestion setupResponse = client.updateSurveyQuestion(setupRequest);


        // Set request parameters
        SurveyQuestionRequest request = new SurveyQuestionRequest();


        Exception ex = null;
        try {
            SurveyQuestionResponse response = client.surveyQuestions(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
