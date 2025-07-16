package com.example.orderservice.Entity;

import com.example.orderservice.Dto.OrderItemDto;
import com.example.orderservice.Enum.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    private Long orderId;
    private Long userId;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;
    private double totalPrice;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;



}
