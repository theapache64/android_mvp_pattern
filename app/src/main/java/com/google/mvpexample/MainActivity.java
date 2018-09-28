package com.google.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.mvpexample.models.MainActivityPresenterImpl;
import com.google.mvpexample.presenters.MainActivityPresenter;
import com.google.mvpexample.views.MainActivityView;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        presenter = new MainActivityPresenterImpl(this);


        final EditText etName = findViewById(R.id.etName);
        findViewById(R.id.bSayHello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = etName.getText().toString();
                presenter.sayGreetings(name);
            }
        });

    }

    @Override
    public void onGreetings(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
