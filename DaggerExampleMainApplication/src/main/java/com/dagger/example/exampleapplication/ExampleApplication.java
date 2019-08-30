package com.dagger.example.exampleapplication;

import com.dagger.example.exampleapplication.di.DaggerExampleApplicationComponent;
import com.dagger.example.exampleapplication.di.ExampleApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created on 2019-08-30.
 */
public class ExampleApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        ExampleApplicationComponent appComponent = DaggerExampleApplicationComponent
                .builder()
                .application(this)
                .build();
        appComponent.inject(this);
        return appComponent;
    }
}