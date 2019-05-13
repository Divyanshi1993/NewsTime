package com.nytimes.news.di.builder;

import com.nytimes.news.view.fragment.ArticleDetailFragment;
import com.nytimes.news.view.fragment.ArticleListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * This builder provides android injector service to fragments
 */
@Module
public abstract class FragmentBuilderModule {

    @SuppressWarnings("unused")
    @ContributesAndroidInjector
    abstract ArticleListFragment contributeArticleListFragment();

    @SuppressWarnings("unused")
    @ContributesAndroidInjector
    abstract ArticleDetailFragment contributeArticleDetailFragment();

}
