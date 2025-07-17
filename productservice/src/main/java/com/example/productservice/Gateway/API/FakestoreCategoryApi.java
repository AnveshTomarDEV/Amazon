package com.example.productservice.Gateway.API;

import com.example.productservice.DTO.FakestoreCategoryResponseDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;
@Component
public interface FakestoreCategoryApi {

    @GET("products/category")
    Call<FakestoreCategoryResponseDTO> getAllFakeCategories () throws IOException;


}
