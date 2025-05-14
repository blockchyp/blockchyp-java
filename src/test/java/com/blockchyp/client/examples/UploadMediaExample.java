package com.blockchyp.client.examples;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;


import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.UploadMetadata;
import com.blockchyp.client.dto.MediaMetadata;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class UploadMediaExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        UploadMetadata request = new UploadMetadata();
        request.setFileName("aviato.png");
        request.setFileSize(18843);
        request.setUploadId("<RANDOM ID>");

        // Send the request
        InputStream inStream = new FileInputStream(new File("aviato.png"));
        MediaMetadata response = client.uploadMedia(request, inStream);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
