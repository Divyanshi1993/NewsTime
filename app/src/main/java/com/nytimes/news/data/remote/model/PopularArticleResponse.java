package com.nytimes.news.data.remote.model;

import com.google.gson.annotations.SerializedName;
import com.nytimes.news.data.local.entity.ArticleEntity;

import java.util.List;

/**
 * The model class which holds the top popular articles data
 */
public class PopularArticleResponse {

    @SerializedName("results")
    private List<ArticleEntity> popularArticles;


    /**
     * This method return the list of article entities
     * @return List of entities
     */
    public List<ArticleEntity> getPopularArticles() {
        return popularArticles;
    }

    /**
     * This method sets the article entities
     * @param popularArticles - articleslist
     */
    @SuppressWarnings("unused")
    public void setPopularArticles(List<ArticleEntity> popularArticles) {
        this.popularArticles = popularArticles;
    }
}
