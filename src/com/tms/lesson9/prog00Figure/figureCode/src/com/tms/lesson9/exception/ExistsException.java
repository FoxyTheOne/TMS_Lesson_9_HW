package com.tms.lesson9.exception;

public class ExistsException extends Exception{

    public ExistsException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "ExistsException {"
                + " message: " + getMessage()
                + " } ";
    }

}
