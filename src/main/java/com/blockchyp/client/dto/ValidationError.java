package com.blockchyp.client.dto;

public class ValidationError {
    
    private String error;
    private String fieldId;
    private String errorFormat;
    private String localizedError;
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public String getFieldId() {
        return fieldId;
    }
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }
    public String getErrorFormat() {
        return errorFormat;
    }
    public void setErrorFormat(String errorFormat) {
        this.errorFormat = errorFormat;
    }
    public String getLocalizedError() {
        return localizedError;
    }
    public void setLocalizedError(String localizedError) {
        this.localizedError = localizedError;
    }
    
    

}
