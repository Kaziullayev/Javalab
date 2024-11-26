package com.example.kaziullayevjava4.Repositories;


import com.example.kaziullayevjava4.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}