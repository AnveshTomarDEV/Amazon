package com.example.orderservice.Dto;

import com.example.orderservice.Enum.OrderStatus;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {

    private Long orderId;
    private Long userId;
    private List<OrderItemDto> items;
    private double totalPrice;
    private OrderStatus status;
    private String createdAt;
}
