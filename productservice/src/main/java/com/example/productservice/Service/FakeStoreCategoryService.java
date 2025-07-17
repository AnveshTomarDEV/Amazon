package com.example.productservice.Service;

import com.example.productservice.DTO.CategoryDTO;
import com.example.productservice.Gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

        private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway=categoryGateway;
    }

    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCAtegories();
    }
}
