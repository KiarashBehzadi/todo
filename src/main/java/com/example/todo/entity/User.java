package com.example.todo.entity;

import jakarta.persistence.OneToMany;

import java.util.List;

public class User {


    @OneToMany(mappedBy = "user")
    private List<Todo> todos;
}
