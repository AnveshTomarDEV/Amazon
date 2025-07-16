package com.example.orderservice.Dto;

import com.example.orderservice.Enum.OrderStatus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateOrderResponseDto {

    private long orderId;
    private OrderStatus status;
    private double totalAmount;
    private String estimatedDeliveryDate;
}
