package com.example.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoResponseDto {

    private Long todoId;
    private String title;
    private String description;
    private String priority;
    private boolean completed;

}
