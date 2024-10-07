package com.example.lab7.networking

import com.example.lab7.networking.response.Categories_Data;
import com.example.lab7.networking.response.Filter_Data
import com.example.lab7.networking.response.Lookup_Data
import retrofit2.Retrofit
import retrofit2.Call
import retrofit2.converter.gson.GsonConverterFactory

class MealsWebService{

    private lateinit var api: MealsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(MealsApi::class.java)
    }

    fun getMealCategories(): Categories_Data {
        return api.getCategories()
    }

    fun getMealsByCategory(category: String): Filter_Data {
        return api.getFilters()
    }

    fun getMealById(mealId: String): Lookup_Data {
        return api.getLookups()
    }

}