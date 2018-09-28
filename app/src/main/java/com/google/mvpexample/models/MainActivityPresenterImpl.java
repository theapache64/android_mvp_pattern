package com.google.mvpexample.models;

import com.google.mvpexample.App;
import com.google.mvpexample.api.responses.GetGreetingsResponse;
import com.google.mvpexample.presenters.MainActivityPresenter;
import com.google.mvpexample.views.MainActivityView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityPresenterImpl implements MainActivityPresenter {
    private final MainActivityView view;

    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
    }

    @Override
    public void sayGreetings(String name) {
        App.apiInterface.getGreetings(name).enqueue(new Callback<GetGreetingsResponse>() {
            @Override
            public void onResponse(Call<GetGreetingsResponse> call, Response<GetGreetingsResponse> response) {
                view.onGreetings(response.body().getData().getGreeting());
            }

            @Override
            public void onFailure(Call<GetGreetingsResponse> call, Throwable t) {

            }
        });
    }
}
