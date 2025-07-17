package com.example.orderservice.ModelMapper;
//package com.example.Orderservice.mapper;

import com.example.Orderservice.dto.OrderItemDTO;
import com.example.Orderservice.entity.Order;
import com.example.Orderservice.entity.OrderItem;
import com.example.orderservice.Dto.OrderItemDto;
import com.example.orderservice.Entity.OrderItem;

public class OrderItemMapper {

    public static OrderItem toEntity(OrderItemDto itemDTO, Order order, double pricePerUnit, double totalPrice) {
        return OrderItem.builder()
                .productId(itemDTO.getProductId())
                .quantity(itemDTO.getQuantity())
                .pricePerUnit(pricePerUnit)
                .totalPrice(totalPrice)
                .order(order)
                .build();
    }
}