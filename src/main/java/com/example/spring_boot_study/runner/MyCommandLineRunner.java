package com.example.spring_boot_study.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyCommandLineRunner implements CommandLineRunner {
    private final Environment environment;
    public  MyCommandLineRunner(Environment environment){
        this.environment=environment;
    }

    @Override
    public void run(String... args) throws Exception {
        String activeProfile = environment.getProperty("spring.profiles.active");
        String port = environment.getProperty("server.port","8080");
        System.out.println("========================================");
        System.out.println("Приложение запущено");
        System.out.println("Профиль: " + activeProfile);
        System.out.println("Порт: " + port);
        System.out.println("========================================");

    }
}
