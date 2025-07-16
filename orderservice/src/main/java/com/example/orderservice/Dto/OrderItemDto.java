package com.example.orderservice.Dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDto {

    private Long productId;
    private Long categoryId;
    private int quantity;

}
