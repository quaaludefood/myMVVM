package com.example.mymvvm.remote;

import com.example.mymvvm.remote.model.ActionsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/{index}.json")
    Call<ActionsResponse> loadPopularArticles(@Path("index") int index);
}
