package com.blockchyp.client.dto;

/**
 * Models results from a text prompt on the teminal.
 * @author jeffreydpayne
 *
 */
public class TextPromptResponse extends Acknowledgement {

    private String response;

    
    /**
     * Returns the text prompt response.
     * @return - the text prompt responsel.
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the text prompt response.
     * @param response - text prompt response.
     */
    public void setResponse(String response) {
        this.response = response;
    }

}
