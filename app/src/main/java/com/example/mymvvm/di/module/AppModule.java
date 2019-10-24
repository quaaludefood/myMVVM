package com.example.mymvvm.di.module;

import com.example.mymvvm.remote.ApiService;
import com.example.mymvvm.remote.ApiConstants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

import dagger.Provides;

public class AppModule {

    @Provides
    @Singleton
    ApiService provideRetrofit(OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit.create(ApiService.class);
    }
}
