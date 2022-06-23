
package com.uevitondev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uevitondev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
