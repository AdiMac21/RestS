package com.example.java2.rests;

import com.example.java2.rests.Model.User;
import com.example.java2.rests.Model.UserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by java2 on 11/10/2016.
 */

public interface Api {


    @GET("users?site=stackoverflow")
    Call<UserResponse> getUser(@Query("pagesize")int size,@Query("sort")String sort);
}
