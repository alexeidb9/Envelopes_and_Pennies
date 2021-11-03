package com.envelopes.controller;

import com.envelopes.exceptions.EnvelopeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EnvelopeNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(EnvelopeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EnvelopeNotFoundException ex) {
        return ex.getMessage();

    }
}
