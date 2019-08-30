package com.dagger.example.exampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dagger.example.daggerexamplelibrary.services.ServiceBar;
import com.dagger.example.daggerexamplelibrary.services.ServiceFoo;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

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
