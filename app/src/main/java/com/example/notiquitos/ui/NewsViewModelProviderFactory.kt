package com.example.notiquitos.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notiquitos.repository.NewsRepository


class NewsViewModelProviderFactory(
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {

    lateinit var viewModel: NewsViewModel

    override fun <T : ViewModel?> create(modelClass: java.lang.Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}