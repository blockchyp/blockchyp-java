package com.blockchyp.client.dto;

import java.util.List;

public class Acknowledgement {
    
    private boolean success;
    private String error;
    private String errorMessage;
    private String localizedError;
    private List<ValidationError> errors;
    
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
    public String getLocalizedError() {
        return localizedError;
    }
    public void setLocalizedError(String localizedError) {
        this.localizedError = localizedError;
    }
    public List<ValidationError> getErrors() {
        return errors;
    }
    public void setErrors(List<ValidationError> errors) {
        this.errors = errors;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    

}
