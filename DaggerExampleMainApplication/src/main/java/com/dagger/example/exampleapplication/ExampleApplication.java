package com.dagger.example.exampleapplication;

import com.dagger.example.daggerexamplelibrary.services.ServiceBar;
import com.dagger.example.daggerexamplelibrary.services.ServiceFoo;
import com.dagger.example.exampleapplication.di.DaggerExampleApplicationComponent;
import com.dagger.example.exampleapplication.di.ExampleApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

/**
 * Created on 2019-08-30.
 */
public class ExampleApplication extends DaggerApplication {

    @Inject
    ServiceFoo serviceFoo;

    @Inject
    ServiceBar serviceBar;

    @Override
    public void onCreate() {
        super.onCreate();

        serviceFoo.downloadImages();

        serviceBar.uploadImages();
    }

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