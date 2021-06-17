package com.example.thenews;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class myClient {
    private static  final String BASE_URL="https://newsapi.org/v2/";
    private static myClient mapiClient;
    private    static Retrofit vretrofit;
    private  myClient()
    {
        vretrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static synchronized myClient getInstance()
    {
        if (mapiClient==null)
        {
            mapiClient=new myClient();
        }
        return mapiClient;
    }
    public myQuery getApi()
    {
        return vretrofit.create(myQuery.class);
    }
}
