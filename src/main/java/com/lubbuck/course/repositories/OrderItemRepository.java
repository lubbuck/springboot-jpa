package com.lubbuck.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lubbuck.course.entities.OrderItem;
import com.lubbuck.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
