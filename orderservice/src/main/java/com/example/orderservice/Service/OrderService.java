package com.example.orderservice.Service;

import com.example.orderservice.Dto.CreateOrderResponseDto;
import com.example.orderservice.Dto.OrderRequestDto;
import com.example.orderservice.Repositories.OrderRepositories;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    private final OrderRepositories orderRepositories;

    public OrderService(OrderRepositories orderRepositories){
        this.orderRepositories=orderRepositories;
    }
    @Override
    public CreateOrderResponseDto createOrder(OrderRequestDto request) {
        return null;
    }
}
