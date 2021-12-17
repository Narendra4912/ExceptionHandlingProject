package com.blz.ExceptionHandlingMain;

public class CustomEmailException extends Exception{

    public String message;

    public CustomEmailException(String message) {
        this.message = message;
    }
}
