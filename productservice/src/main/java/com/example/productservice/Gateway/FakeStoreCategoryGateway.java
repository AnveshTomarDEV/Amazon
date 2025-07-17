package com.example.productservice.Gateway;

import com.example.productservice.DTO.CategoryDTO;
import com.example.productservice.DTO.FakestoreCategoryResponseDTO;
import com.example.productservice.Gateway.API.FakestoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakestoreCategoryApi fakestoreCategoryApi;

    FakeStoreCategoryGateway(FakestoreCategoryApi fakestoreCategoryApi){
        this.fakestoreCategoryApi=fakestoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCAtegories() throws IOException {
        FakestoreCategoryResponseDTO response =  this.fakestoreCategoryApi.getAllFakeCategories().execute().body();
        if (response==null){
            throw new IOException("failed to fetch categories from fakeStore");
        }
        return response.getCategories().stream()
                .map(category -> CategoryDTO.builder()
                        .name(category)
                        .build())
                .toList();









    }
}
