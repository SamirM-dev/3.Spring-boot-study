package com.example.spring_boot_study.service;

import com.example.spring_boot_study.properties.AppProperties;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class StartupService {
    private final AppProperties appProperties;

    public StartupService(AppProperties appProperties) {
        this.appProperties = appProperties;
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("App name is : "+appProperties.getName());
        System.out.println("Max items count is : "+appProperties.getMaxItems());
        System.out.println("Admin email is : "+appProperties.getAdminEmail());
    }



}
