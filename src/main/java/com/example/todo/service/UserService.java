package com.example.todo.service;

import com.example.todo.dto.UserRequestDto;
import com.example.todo.dto.UserResponseDto;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);
}
