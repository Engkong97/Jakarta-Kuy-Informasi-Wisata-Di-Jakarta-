package com.example.arya.jakarta.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL ="http://milanisti12.000webhostapp.com/index.php/";

    public static Retrofit setClient(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getService(){
        return setClient().create(ApiService.class);
    }
}
