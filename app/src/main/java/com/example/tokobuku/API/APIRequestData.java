package com.example.tokobuku.API;

import com.example.tokobuku.Model.ResponsModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("retrieve.php")
    Call<ResponsModel> ardRetrieveData();
}
