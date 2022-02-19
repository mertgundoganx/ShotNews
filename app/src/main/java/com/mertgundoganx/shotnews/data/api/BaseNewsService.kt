package com.mertgundoganx.shotnews.data.api

import com.mertgundoganx.shotnews.data.model.BaseNews
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BaseNewsService {

    @GET("news")
    suspend fun getBaseNews(
        @Query("apikey") apiKey: String,
        @Query("category") category: String = "top",
        @Query("language") language: String = "en",
    ): Response<BaseNews>

}