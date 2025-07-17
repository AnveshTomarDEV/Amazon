package com.example.productservice.Gateway;

import com.example.productservice.DTO.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDTO> getAllCAtegories() throws IOException;

}
