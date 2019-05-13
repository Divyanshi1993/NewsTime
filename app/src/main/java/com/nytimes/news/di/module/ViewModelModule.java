package com.nytimes.news.di.module;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.nytimes.news.viewmodel.ArticleDetailsViewModel;
import com.nytimes.news.viewmodel.ArticleListViewModel;
import com.nytimes.news.viewmodel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Allow us to inject dependencies via constructor injection
 */
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ArticleListViewModel.class)
    @SuppressWarnings("unused")
    abstract ViewModel bindsArticleListViewModel(ArticleListViewModel articleListViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ArticleDetailsViewModel.class)
    @SuppressWarnings("unused")
    abstract ViewModel bindsArticleDetailsiewModel(ArticleDetailsViewModel articleDetailsViewModel);


    @Binds
    @SuppressWarnings("unused")
    abstract ViewModelProvider.Factory bindsViewModelFactory(ViewModelFactory viewModelFactory);
}
