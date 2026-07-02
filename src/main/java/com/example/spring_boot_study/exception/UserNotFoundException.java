package com.example.spring_boot_study.exception;

public class UserNotFoundException extends MyAppException {

    public UserNotFoundException(int id) {
        super("Пользователь не был найден id= "+id,404);
    }
}
