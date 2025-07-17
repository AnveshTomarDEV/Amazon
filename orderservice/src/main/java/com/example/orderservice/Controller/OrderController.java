package com.example.orderservice.Controller;


import com.example.orderservice.Dto.CreateOrderResponseDto;
import com.example.orderservice.Dto.OrderRequestDto;
import com.example.orderservice.Service.IOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final IOrderService orderService;

    public OrderController(IOrderService orderService){
        this.orderService=orderService;
    }

    public ResponseEntity<CreateOrderResponseDto> createOrder(@RequestBody OrderRequestDto request){
        CreateOrderResponseDto order = orderService.createOrder(request);
        return ResponseEntity.ok(order);

    }
}
