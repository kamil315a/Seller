package com.example.seller.network;

import com.example.seller.my_interface.DataBaseService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public
class RetrofitInstance {

    private static final String BASE_URL = "http://localhost/";

    private static Retrofit retrofit;

    public static
    Retrofit getRetrofit()
        {
        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        return retrofit;
        }


}
