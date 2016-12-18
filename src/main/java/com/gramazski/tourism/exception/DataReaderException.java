package com.gramazski.tourism.exception;

/**
 * Created by gs on 18.12.2016.
 */
public class DataReaderException extends Exception {
    public DataReaderException() {
    }

    public DataReaderException(String message, Throwable exception) {
        super(message, exception);
    }

    public DataReaderException(String message) {
        super(message);
    }

    public DataReaderException(Throwable exception) {
        super(exception);
    }
}
