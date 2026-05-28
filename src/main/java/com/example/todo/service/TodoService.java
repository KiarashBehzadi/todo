package com.example.todo.service;

import com.example.todo.dto.TodoRequestDto;
import com.example.todo.dto.TodoResponseDto;
import java.util.List;

public interface TodoService {

    TodoResponseDto createTodo(Long userId, TodoRequestDto dto);

    List<TodoResponseDto> getUserTodos(Long userId);
}
