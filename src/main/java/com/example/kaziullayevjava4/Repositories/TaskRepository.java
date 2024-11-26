package com.example.kaziullayevjava4.Repositories;


import com.example.kaziullayevjava4.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query("SELECT t FROM Task t WHERE t.user.username = :username")
    List<Task> findByUserUsername(@Param("username") String username);


}