package com.nytimes.news.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.nytimes.news.data.local.dao.ArticleDao;
import com.nytimes.news.data.local.entity.ArticleEntity;
@Database(entities = {ArticleEntity.class}, version = 2)
public abstract class ArticleDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}