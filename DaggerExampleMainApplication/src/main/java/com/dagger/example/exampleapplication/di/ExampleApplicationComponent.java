package com.dagger.example.exampleapplication.di;

import android.app.Application;

import com.dagger.example.daggerexamplelibrary.di.LibraryAppModule;
import com.dagger.example.exampleapplication.ExampleApplication;

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
public interface ExampleApplicationComponent extends AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        ExampleApplicationComponent build();
    }

    void inject(ExampleApplication app);

    @Override
    void inject(DaggerApplication instance);
}