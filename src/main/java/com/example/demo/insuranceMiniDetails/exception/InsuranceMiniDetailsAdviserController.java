package com.example.demo.insuranceMiniDetails.exception;

import com.example.demo.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class InsuranceMiniDetailsAdviserController {

    @ExceptionHandler(DataNullException.class)
    public ResponseEntity<ErrorResponse> dataNull(DataNullException e){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(e + " is null.");
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

}
