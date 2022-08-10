package com.example.seller.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public
class RetrofitInstance {

    private static final String BASE_URL = "http://localhost/";

    private Retrofit retrofit;

    {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public
    Retrofit getRetrofit()
        {
        return retrofit;
        }
}
