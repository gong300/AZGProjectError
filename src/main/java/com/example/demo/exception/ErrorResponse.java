package com.example.demo.exception;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class ErrorResponse {
    private String message;
    private LocalDateTime time = LocalDateTime.now();
    private int status;
}
//We will show these messages when have an error