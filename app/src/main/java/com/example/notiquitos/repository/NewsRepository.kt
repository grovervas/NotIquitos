package com.example.notiquitos.repository

import com.example.notiquitos.api.RetrofitInstance
import com.example.notiquitos.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getTopNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getTopNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}