package com.example.java2.rests;

import com.example.java2.rests.Model.CommentsResponse;
import com.example.java2.rests.Model.PostResponse;
import com.example.java2.rests.Model.QuestionsResponse;
import com.example.java2.rests.Model.User;
import com.example.java2.rests.Model.UserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by java2 on 11/10/2016.
 */

public interface Api {


    @GET("users?site=stackoverflow")
    Call<UserResponse> getUser(@Query("pagesize")int size,@Query("sort")String sort);

    @GET("comments?site=stackoverflow")
    Call<CommentsResponse> getComments(@Query("order")String order,@Query("sort")String votes,@Query("pagesize")int size,@Query("min")int min);

    @GET("posts/{ids}?site=stackoverflow")
    Call<PostResponse> getPostResponseCall(@Path("ids") long id);
    @GET("users/{ids}/questions?site=stackoverflow")
    Call<QuestionsResponse> getQuestionsResponseCall (@Path("ids")long id),@Query("sort")String votes,
}
