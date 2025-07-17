package com.example.productservice.DTO;

import lombok.*;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakestoreCategoryResponseDTO {
    private String status;

    private String message;

    private List<String> categories;
}
