package com.example.spring_boot_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello,it is Spring Boot!";
    }

    @GetMapping("/info")
    public String info() {
        return "Spring Boot application is working...";
    }
}
