package com.example.lab7.networking;

import com.example.lab7.networking.response.Categories_Data;
import com.example.lab7.networking.response.Filter_Data
import com.example.lab7.networking.response.Lookup_Data
import retrofit2.http.GET;

interface MealsApi {

    @GET("categories.php")
    suspend fun getCategories(): Categories_Data

    @GET("filter.php")
    suspend fun getFilters(): Filter_Data

    @GET("lookup.php")
    suspend fun getLookups(): Lookup_Data
}
