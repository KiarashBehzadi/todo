package com.example.todo.service;

import com.example.todo.dto.UserRequestDto;
import com.example.todo.dto.UserResponseDto;
import com.example.todo.entity.User;
import com.example.todo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = new User();
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(userRequestDto.getPassword());

        userRepository.save(user);

        return toDto(user);
    }


    // maps user-entity to UserResponse-Dto
    private UserResponseDto toDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setUserId(user.getUserId());
        userResponseDto.setUsername(user.getUsername());
        return userResponseDto;
    }
}
