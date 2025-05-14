package com.blockchyp.client.examples;


import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.SurveyQuestion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class UpdateSurveyQuestionExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        SurveyQuestion request = new SurveyQuestion();
        request.setId("<QUESTION ID>");
        request.setOrdinal(1);
        request.setQuestionText("Would you shop here again?");
        request.setQuestionType("yes_no");
        request.setEnabled(true);

        // Send the request
        SurveyQuestion response = client.updateSurveyQuestion(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
