package com.example.spring_boot_study.exception;

import lombok.Getter;

@Getter public class MyAppException extends RuntimeException {
    private final int statusCode;
    public MyAppException(String message,int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }
}
