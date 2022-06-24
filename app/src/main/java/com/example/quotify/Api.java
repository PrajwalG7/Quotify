package com.example.quotify;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("quotes")
    Call<List<Model>> getModels();
}
