package com.example.spring_boot_study.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class TaskService {
    public String createTask(String title) {
        log.debug("createTask был вызван с title={}", title);
        String taskId=null;
        if (title==null || title.isBlank()) {
            log.warn("Попытка создать задачу с пустым именем.");
            throw  new IllegalArgumentException("Имя задачи не может быть пустым!");
        }
        try {
            taskId = title+System.currentTimeMillis();
            log.info("Задача создана с title={},id={}",title,taskId);
            System.out.println("Задача " +title+" была создана с id "+taskId);

        } catch (Exception e) {
            log.error("Ошибка при создании задачи с именем {}",title,e);
        }
        return taskId;
    }

    public void deleteTask(String taskId) {
        log.debug("deleteTask был вызван для удаления задачи с id={}",taskId);
        if (taskId==null || taskId.isBlank()) {
            log.warn("Попытка удалить задачу с пустым id.");
            throw  new IllegalArgumentException("Id задачи не может быть пустым!");
        }
        try {
            log.info("Задачи с id={} была удалена из БД",taskId);
            System.out.println("Задача " +taskId+" была удалена ");

        } catch (Exception e) {
            log.error("Ошибка при создании задачи с id {}",taskId,e);
        }
    }
}
