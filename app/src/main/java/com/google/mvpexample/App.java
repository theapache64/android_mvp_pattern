package com.google.mvpexample;

import android.app.Application;

import com.google.mvpexample.api.APIInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    public static APIInterface apiInterface;

    @Override
    public void onCreate() {
        super.onCreate();

        apiInterface = new Retrofit.Builder()
                .baseUrl("http://theapache64.com/mock_api/get_json/say_greeting/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(APIInterface.class);


    }
}
