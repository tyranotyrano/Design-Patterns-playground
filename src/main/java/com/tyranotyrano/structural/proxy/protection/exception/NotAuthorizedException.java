package com.tyranotyrano.structural.proxy.protection.exception;

public class NotAuthorizedException extends RuntimeException {
    private String message;

    public NotAuthorizedException(String message) {
        this.message = message;
    }
}
