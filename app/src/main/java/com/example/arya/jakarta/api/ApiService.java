package com.example.arya.jakarta.api;



import com.example.arya.jakarta.model.Wisataresponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("tampil_jaksel.php")
    Call<Wisataresponse> tampil_jaksel();

    @GET("tampil_jakbar.php")
    Call<Wisataresponse> tampil_jakbar();

    @GET("tampil_jakpus.php")
    Call<Wisataresponse> tampil_jakpus();

    @GET("tampil_jaktim.php")
    Call<Wisataresponse> tampil_jaktim();

    @GET("tampil_jakut.php")
    Call<Wisataresponse> tampil_jakut();

    @GET("tampill_semua.php")
    Call<Wisataresponse> tampil_semua();


}