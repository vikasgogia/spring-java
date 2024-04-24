package com.vg.restapi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex) {
        StudentErrorResponse errResp = new StudentErrorResponse(
                HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(errResp, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception ex) {
        StudentErrorResponse errResp = new StudentErrorResponse(
                HttpStatus.BAD_REQUEST.value(), ex.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(errResp, HttpStatus.BAD_REQUEST);
    }
}
