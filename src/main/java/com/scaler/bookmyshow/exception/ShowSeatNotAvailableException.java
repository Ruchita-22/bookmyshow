package com.scaler.bookmyshow.exception;

public class ShowSeatNotAvailableException extends Exception {
    public ShowSeatNotAvailableException() {
    }

    public ShowSeatNotAvailableException(String message) {
        super(message);
    }

    public ShowSeatNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }
}
