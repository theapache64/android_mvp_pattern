package com.google.mvpexample.models;

import com.google.mvpexample.presenters.MainActivityPresenter;
import com.google.mvpexample.views.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {
    private final MainActivityView view;

    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
    }

    @Override
    public void sayGreetings(String name) {
        view.onGreetings("Hello, " + name);
    }
}
