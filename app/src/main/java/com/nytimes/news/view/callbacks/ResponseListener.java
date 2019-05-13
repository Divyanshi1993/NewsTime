package com.nytimes.news.view.callbacks;

import com.nytimes.news.data.local.entity.ArticleEntity;

public interface ResponseListener {

    void onSuccess(ArticleEntity data);
    void onFailure(String message);
}
