package com.uevitondev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uevitondev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
