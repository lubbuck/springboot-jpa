package com.lubbuck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lubbuck.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
