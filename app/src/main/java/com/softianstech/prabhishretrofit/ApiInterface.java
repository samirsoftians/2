package com.softianstech.prabhishretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Lenovo on 9/15/2017.
 */

public interface ApiInterface {

    @POST("getquestion.php")

  //  Call<List<Contact>> getContacts();
 Call<List<Contact>> getContacts();

}
