package com.steve.jobsjson.util.exceptions;

public class DataValidationException extends RuntimeException {
    private String message;

    public DataValidationException(){}

    public DataValidationException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
