package com.blockchyp.client.examples;



import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TermsAndConditionsRequest;
import com.blockchyp.client.dto.TermsAndConditionsResponse;
import com.blockchyp.client.dto.SignatureFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class TermsAndConditionsExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        TermsAndConditionsRequest request = new TermsAndConditionsRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setTcAlias("hippa");
        request.setTcName("HIPPA Disclosure");
        request.setTcContent("Full contract text");
        request.setSigFormat(SignatureFormat.PNG);
        request.setSigWidth(200);
        request.setSigRequired(true);

        // Send the request
        TermsAndConditionsResponse response = client.termsAndConditions(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
