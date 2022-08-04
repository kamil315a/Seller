package com.example.seller.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public
class UserList {

    @SerializedName("user_list")
    private
    ArrayList<UserModel> userModelArrayList;

    public
    ArrayList<UserModel> getUserModelArrayList()
        {
        return userModelArrayList;
        }

    public
    void setUserModelArrayList(ArrayList<UserModel> userModelArrayList)
        {
        this.userModelArrayList = userModelArrayList;
        }
}
