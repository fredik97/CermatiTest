package com.example.cermatitest.api;

import com.example.cermatitest.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/search/users?q=user")
    Call<ItemResponse> getItems();

}
