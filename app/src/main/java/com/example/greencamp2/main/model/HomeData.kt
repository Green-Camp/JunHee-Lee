package com.example.greencamp2.main.model

import com.example.greencamp2.main.model.Banner
import com.example.greencamp2.main.model.Title
import com.google.gson.annotations.SerializedName

data class HomeData(
    val title: Title,
    @SerializedName("top_banners") val topBanners:
    List<Banner>
)