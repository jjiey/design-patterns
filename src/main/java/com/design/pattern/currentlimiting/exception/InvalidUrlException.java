package com.design.pattern.currentlimiting.exception;

/**
 * @author yangsanity
 */
public class InvalidUrlException extends RuntimeException {

    public InvalidUrlException(String message) {
        super(message);
    }

    public InvalidUrlException(Throwable e) {
        super(e);
    }

    public InvalidUrlException(String message, Throwable e) {
        super(message, e);
    }
}
