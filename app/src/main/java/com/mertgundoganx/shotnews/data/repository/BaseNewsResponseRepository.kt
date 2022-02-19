package com.mertgundoganx.shotnews.data.repository

import com.mertgundoganx.shotnews.BuildConfig
import com.mertgundoganx.shotnews.data.api.BaseNewsService

class BaseNewsResponseRepository(private val baseNewsService: BaseNewsService) {

    private val apiKey = BuildConfig.apiKey

    suspend fun getBaseNews(category: String = "top") = baseNewsService.getBaseNews(apiKey = apiKey, category = category)

}