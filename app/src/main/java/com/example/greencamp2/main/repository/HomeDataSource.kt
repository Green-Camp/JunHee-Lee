package com.example.greencamp2.main.repository

import com.example.greencamp2.main.model.HomeData

interface HomeDataSource {
    fun getHomeData(): HomeData?
}