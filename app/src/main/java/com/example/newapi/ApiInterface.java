package com.example.newapi;



import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/products/1")
    Call<ApiResponse1> getAllData();
}
