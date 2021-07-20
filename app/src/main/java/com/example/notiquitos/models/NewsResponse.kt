package com.example.notiquitos.models

import com.example.notiquitos.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)