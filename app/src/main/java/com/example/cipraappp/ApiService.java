package com.example.cipraappp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("takehome/signin")
    Call<Void> signIn(@Query("email") String email, @Query("password") String password);
}
