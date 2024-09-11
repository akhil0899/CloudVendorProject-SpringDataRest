package com.thinkconstructive.rest_demo.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {

    private final String message;
    private final Throwable throwable;
    private final int httpStatus;

    public CloudVendorException(String message, Throwable throwable,int httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public int getHttpStatus() {
        return httpStatus;
    }


}
