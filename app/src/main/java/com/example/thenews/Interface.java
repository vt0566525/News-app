package com.example.thenews;

import com.example.thenews.parameter.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Interface {
//    @GET("top-headlines")
//    Call<Headlines> getHeadlines(
//            @Query("country") String country,
//            @Query("apiKey") String apiKey
//    );
@GET("everything")
Call<Headlines> getHeadlines(
        @Query("q") String q,
        @Query("apiKey") String apiKey
);
}
