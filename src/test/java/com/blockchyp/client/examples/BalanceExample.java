package com.blockchyp.client.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BalanceRequest;
import com.blockchyp.client.dto.BalanceResponse;
import com.blockchyp.client.dto.CardType;

public class BalanceExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        BalanceRequest request = new BalanceRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setCardType(CardType.EBT);

        // Send the request
        BalanceResponse response = client.balance(request);

        // View the result
        System.out.println("Response: " + prettyPrint(response));
    }

    public static String prettyPrint(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);
    }
}

