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

public class TermsAndConditionsTestTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         TermsAndConditionsRequest request = new TermsAndConditionsRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setTCName("HIPPA Disclosure");
         request.setTCContent("Full contract text");
         request.setSigFormat("png");
         request.setSigWidth(200);
         request.setSigRequired(true);

         TermsAndConditionsResponse response = client.tc(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());

    }


}