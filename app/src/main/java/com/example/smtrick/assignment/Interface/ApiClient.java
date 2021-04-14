package com.example.smtrick.assignment.Interface;

import com.example.smtrick.assignment.Models.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiClient {
    String BASE_URL = "http://machinetest.erpguru.in/service.asmx/";

    @GET("GetCustomerRegisteredByApp_1_0")
//    Call<Example> getUsers();
    Call <Example> getUsers(@Query("UserId") String userId, @Query("PageNo") String pageno);
}
