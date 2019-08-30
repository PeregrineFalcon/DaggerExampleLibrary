package com.dagger.example.daggerexamplelibrary;

import com.dagger.example.daggerexamplelibrary.di.DaggerLibraryComponent;
import com.dagger.example.daggerexamplelibrary.di.LibraryComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created on 2019-08-30.
 */
public class LibraryApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        LibraryComponent libComponent = DaggerLibraryComponent.builder()
                .library(this)
                .build();
        libComponent.inject(this);
        return libComponent;
    }
}
