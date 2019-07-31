package com.ilham.RecDessertApps.api;


import com.ilham.RecDessertApps.model.RecipeModels;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {



    @GET("recipe/getdata")
    Call<RecipeModels> getsemuadata();

    @GET("recipe/getdata")
    Call<RecipeModels> getdataByNama(@Query("cari") String cari);

}
