package com.nytimes.news.view.callbacks;

import com.nytimes.news.data.local.entity.ArticleEntity;

/**
 * File Description
 */
public interface ArticleListCallback {
    void onArticleClicked(ArticleEntity articleEntity);
}

