package com.dagger.example.daggerexamplelibrary.di;

import android.app.Application;

import com.dagger.example.daggerexamplelibrary.LibraryApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created on 2019-08-30.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        LibraryAppModule.class
})
public interface LibraryComponent extends AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder library(Application application);
        LibraryComponent build();
    }

    void inject(LibraryApplication app);

    @Override
    void inject(DaggerApplication instance);
}
