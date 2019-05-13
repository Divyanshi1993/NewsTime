package com.nytimes.news.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;


import com.nytimes.news.data.local.entity.ArticleEntity;
import com.nytimes.news.data.remote.Resource;
import com.nytimes.news.data.remote.repository.ArticleRepository;

import java.util.List;

import javax.inject.Inject;

public class ArticleListViewModel extends ViewModel {
    private final LiveData<Resource<List<ArticleEntity>>> popularArticles;

    @Inject
    public ArticleListViewModel(ArticleRepository articleRepository) {
        popularArticles = articleRepository.loadPopularArticles(7);
    }

    public LiveData<Resource<List<ArticleEntity>>> getPopularArticles() {
        return popularArticles;
    }
}
