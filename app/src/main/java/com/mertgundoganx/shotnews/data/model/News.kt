package com.mertgundoganx.shotnews.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
    @SerializedName("title") val title: String = "",
    @SerializedName("link") val link: String = "",
    @SerializedName("description") val description: String = "",
    @SerializedName("pubDate") val pubDate: String = "",
    @SerializedName("full_description") val full_description: String = "",
    @SerializedName("image_url") val image_url: String = "",
    @SerializedName("source_id") val source_id: String = "",
    @SerializedName("category") val category: List<String> = listOf()
) : Parcelable