package com.example.orderservice.Repositories;

import com.example.orderservice.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositories  extends JpaRepository<Order,Long> {
}
