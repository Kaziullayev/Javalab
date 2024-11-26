package com.example.kaziullayevjava4.Repositories;

import com.example.kaziullayevjava4.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}