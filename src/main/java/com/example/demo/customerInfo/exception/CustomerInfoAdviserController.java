package com.example.demo.customerInfo.exception;

import com.example.demo.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerInfoAdviserController {
    @ExceptionHandler(DatanullException.class)
    public ResponseEntity<ErrorResponse> datanull(DatanullException e){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(e + " is mull.");
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
