package com.nytimes.news.data.remote;

import com.nytimes.news.data.remote.model.PopularArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * The APIService interface which will contain the semantics of all the REST calls.
 */
public interface ApiService {

    @GET("svc/mostpopular/v2/viewed//{index}.json")
    Call<PopularArticleResponse> loadPopularArticles(@Path("index") int index);
}
