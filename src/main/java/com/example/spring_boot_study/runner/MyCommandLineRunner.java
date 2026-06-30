package com.example.spring_boot_study.runner;

import com.example.spring_boot_study.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyCommandLineRunner implements CommandLineRunner {
    private final Environment environment;
    private final TaskService taskService;
    public  MyCommandLineRunner(Environment environment,TaskService taskService){
        this.environment=environment;
        this.taskService=taskService;
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

        System.out.println("createTask - normal:");
        String taskId=taskService.createTask("task1");
        System.out.println();
        System.out.println("deleteTask - normal:");
        taskService.deleteTask(taskId);
        System.out.println();
        System.out.println("createTask - error:");
        try {
            taskService.createTask("");
        } catch (IllegalArgumentException e) {
            System.out.println("Поймано ожидаемое исключение: " + e.getMessage());
        }

    }
}
