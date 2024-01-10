package com.lubbuck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lubbuck.course.entitier.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
