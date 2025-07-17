package com.example.orderservice.Service;

import com.example.orderservice.Dto.CreateOrderResponseDto;
import com.example.orderservice.Dto.OrderRequestDto;

public interface IOrderService {

    CreateOrderResponseDto createOrder(OrderRequestDto request);
}
