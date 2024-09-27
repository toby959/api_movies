package com.toby.screentoby.exception;

public class ErrorConversionException extends RuntimeException {

    private final String message;

    public ErrorConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

