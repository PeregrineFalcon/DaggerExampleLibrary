package com.dagger.example.exampleapplication;

import android.os.Bundle;

import com.dagger.example.daggerexamplelibrary.services.ServiceBar;
import com.dagger.example.daggerexamplelibrary.services.ServiceFoo;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    ServiceFoo serviceFoo;

    @Inject
    ServiceBar serviceBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceFoo.downloadImages();

        serviceBar.uploadImages();
    }
}
