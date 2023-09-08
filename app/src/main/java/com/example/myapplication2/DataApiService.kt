package com.example.myapplication2

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface DataApiService {
    @GET("/facts/random")
    fun getPosts(): Call<List<Post>>
}

object RetrofitClient {
    private const val BASE_URL = "https://cat-fact.herokuapp.com"

    val instance: DataApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(DataApiService::class.java)
    }
}