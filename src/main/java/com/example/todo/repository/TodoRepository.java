package com.example.todo.repository;

import com.example.todo.entity.Todo;
import com.example.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Query("select t from Todo t where t.user.userId = :userId")
    List<Todo> findByUserId(@Param("userId") Long userId);


}
