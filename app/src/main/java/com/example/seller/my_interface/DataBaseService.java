package com.example.seller.my_interface;

import com.example.seller.model.UserModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public
interface DataBaseService {

    @FormUrlEncoded
    @POST("insert.php/")
    Call<UserModel> createUser(@Field("firstname") String firstname,
        @Field("lastname") String lastname,
        @Field("userEmail") String userEmail,
        @Field("userZipcode") String userZipcode);
/*
    @GET("insert.php/")
    Call<UserModel> editUser()*/
}



