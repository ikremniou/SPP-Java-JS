package com.ilyashutko.buspark.bl.exception;

public class ServiceOperationFailException extends Exception {
    public ServiceOperationFailException() {
    }

    public ServiceOperationFailException(String message) {
        super (message);
    }

    public ServiceOperationFailException(Throwable cause) {
        super (cause);
    }

    public ServiceOperationFailException(String message, Throwable cause) {
        super (message, cause);
    }
}
