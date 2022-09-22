package com.example.seller.model;

import com.google.gson.annotations.SerializedName;

public
class UserModel {

    @SerializedName("userId")
    private String userId;
    @SerializedName("firstname")
    private String firstname;
    @SerializedName("lastname")
    private String lastname;
    @SerializedName("userEmail")
    private String userEmail;
    @SerializedName("userZipcode")
    private String userZipcode;


    public
    String getUserId()
        {
        return userId;
        }

    public
    void setUserId(String userId)
        {
        this.userId = userId;
        }

    public
    String getFirstname()
        {
        return firstname;
        }

    public
    void setFirstname(String firstname)
        {
        this.firstname = firstname;
        }

    public
    String getLastname()
        {
        return lastname;
        }

    public
    void setLastname(String lastname)
        {
        this.lastname = lastname;
        }

    public
    String getUserEmail()
        {
        return userEmail;
        }

    public
    void setUserEmail(String userEmail)
        {
        this.userEmail = userEmail;
        }

    public
    String getUserZipcode()
        {
        return userZipcode;
        }

    public
    void setUserZipcode(String userZipcode)
        {
        this.userZipcode = userZipcode;
        }


    @Override
    public
    String toString()
        {
        return "UserModel{" +
               "userId='" + userId + '\'' +
               ", firstname='" + firstname + '\'' +
               ", lastname='" + lastname + '\'' +
               ", userEmail='" + userEmail + '\'' +
               ", userZipcode='" + userZipcode + '\'' +
               '}';
        }
}
