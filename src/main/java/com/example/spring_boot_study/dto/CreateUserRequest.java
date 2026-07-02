package com.example.spring_boot_study.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data public class CreateUserRequest {
    @NotBlank(message = "Имя обязательно")
    private String name;
    @NotBlank(message = "Email обязателен")
    @Email(message = "Некорректный формат email")
    private String email;
    @Min(value =0,message = "Возраст не может быть отрицательным")
    private int age;

}
