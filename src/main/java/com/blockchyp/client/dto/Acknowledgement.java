package com.blockchyp.client.dto;

/**
 * Models basic response information. This is typically used as a base class for
 * most API responses.
 * 
 * @author jeffreydpayne
 *
 */
public class Acknowledgement {


    private boolean success;
    private String error;

    /**
     * Gets the success flag.
     * @return - true if the API call succeeded.
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the success flag.
     * 
     * @param success - true if the API call succeeded.
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets a narrative description of the error, if any.
     * @return - narrative description of any error.
     */
    public String getError() {
        return error;
    }

    /**
     * Sets a narrative description of the error, if any.
     * @param error - narrative description of any error.
     */
    public void setError(String error) {
        this.error = error;
    }

}
