package com.gramazski.tourism.exception;

/**
 * Created by gs on 18.12.2016.
 */
public class CreatingTourException extends Exception {
    public CreatingTourException() {
    }

    public CreatingTourException(String message, Throwable exception) {
        super(message, exception);
    }

    public CreatingTourException(String message) {
        super(message);
    }

    public CreatingTourException(Throwable exception) {
        super(exception);
    }
}
