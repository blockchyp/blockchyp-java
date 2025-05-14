package com.blockchyp.client.examples;



import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.SlideShow;
import com.blockchyp.client.dto.Slide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class UpdateSlideShowExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        SlideShow request = new SlideShow();
        request.setName("Test Slide Show");
        request.setDelay(5);

        Collection slides = new ArrayList();
        Slide slides0 = new Slide();
        slides0.setMediaId("<MEDIA ID>");
        slides.add(slides0);
        request.setSlides(slides);

        // Send the request
        SlideShow response = client.updateSlideShow(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
