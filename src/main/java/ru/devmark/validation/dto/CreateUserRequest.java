package ru.devmark.validation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.List;

public record CreateUserRequest(
        @NotBlank(message = "имя не может состоять из одних пробелов")
        @Size(min = 2, message = "имя не может быть короче 2-х символов")
        String name,

        @Past(message = "дата рождения не может быть в будущем")
        @NotNull
        LocalDate birthDate,

        @Positive
        int friendsCount,

        @NotNull
        @Size(min = 1, max = 10)
        List<String> documents
) {
}
