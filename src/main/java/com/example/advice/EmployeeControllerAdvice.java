package com.example.advice;

import com.example.exception.EmployeeException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeControllerAdvice extends EmployeeException {

    @ExceptionHandler(EmployeeException.class)
    public String handleException(EmployeeException e) {
        return e.getMessage();
    }
}
