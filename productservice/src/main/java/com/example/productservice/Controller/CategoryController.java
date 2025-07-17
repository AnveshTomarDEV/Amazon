package com.example.productservice.Controller;

import com.example.productservice.DTO.CategoryDTO;
import com.example.productservice.Service.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/categories")
public class CategoryController {

    private ICategoryService categoryService;

    CategoryController(ICategoryService categoryService){
        this.categoryService=categoryService;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryService.getAllCategories();
    }
}
