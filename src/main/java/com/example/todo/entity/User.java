package com.example.todo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Tbl_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @OneToMany(mappedBy = "user")
    private List<Todo> todos;
}
