package com.blockchyp.client.dto;

/**
 * Models basic response information.  This is typically used as a base class for most API responses.
 * @author jeffreydpayne
 *
 */
public class Acknowledgement {
	
	/**
	 * Indicates whether or not the request succeeded.
	 */
    private boolean success;
    /**
     * Description of the error if success is false.
     */
    private String error;

    
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
   
}
