package com.softianstech.prabhishretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lenovo on 9/15/2017.
 */

public class Contact {

    @SerializedName("name")

    private String Name;

    @SerializedName("email")

    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
