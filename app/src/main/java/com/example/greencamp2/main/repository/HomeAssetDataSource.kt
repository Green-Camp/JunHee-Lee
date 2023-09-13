package com.example.greencamp2.main.repository

import com.example.greencamp2.main.AssetLoader
import com.example.greencamp2.main.model.HomeData
import com.google.gson.Gson


class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {

    private val gson = Gson()

    override fun getHomeData(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let { homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}
