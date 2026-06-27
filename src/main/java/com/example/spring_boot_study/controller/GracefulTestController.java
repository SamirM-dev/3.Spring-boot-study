package com.example.spring_boot_study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GracefulTestController {
    @GetMapping("/slow")
    public String slow()throws Exception{
        Thread.sleep(10000);
        return "waiting is over";
    }
}
