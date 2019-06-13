package com.blockchyp.client.dto;

/**
 * Models the response for a terminal boolean prompt.
 * @author jeffreydpayne
 *
 */
public class BooleanPromptResponse extends Acknowledgement {

    private boolean response;

    /**
     * Gets the boolean prompt response.
     * @return - true if the user pressed the 'yes' button
     */
    public boolean isResponse() {
        return response;
    }

    /**
     * Sets the boolean prompt response.
     * @param response - true if the user pressed the 'yes' button.
     */
    public void setResponse(boolean response) {
        this.response = response;
    }

}
