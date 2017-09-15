package com.softianstech.prabhishretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lenovo on 9/15/2017.
 */

public class ApiClient {//192.168.0.3/retrofit"

    public static final String BASE_URL="http://192.168.0.3/retrofit/";
    public static  Retrofit retrofit=null;

    public static Retrofit getApiClient()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
