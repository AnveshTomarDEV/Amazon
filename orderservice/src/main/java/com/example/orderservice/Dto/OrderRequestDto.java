package com.example.orderservice.Dto;

import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequestDto {

    private Long userId;
    private List<OrderItemDto> items;
    private String deliveryAddress;
    private String paymentMethod;
}
