package com.lubbuck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lubbuck.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
