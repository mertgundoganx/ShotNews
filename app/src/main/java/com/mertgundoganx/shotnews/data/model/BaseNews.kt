package com.mertgundoganx.shotnews.data.model

import com.google.gson.annotations.SerializedName

data class BaseNews(
    @SerializedName("status") val status: String = "",
    @SerializedName("results") val results: List<News> = listOf()
)
