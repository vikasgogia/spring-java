package com.vg.restapi.rest;

public class StudentNotFoundException extends RuntimeException {
    // generate constructors using Intellij IDE

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentNotFoundException(Throwable cause) {
        super(cause);
    }
}
