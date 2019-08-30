package com.dagger.example.daggerexamplelibrary.di;

import android.app.Application;
import android.content.Context;

import com.dagger.example.daggerexamplelibrary.services.ServiceBar;
import com.dagger.example.daggerexamplelibrary.services.ServiceFoo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created on 2019-08-30.
 */
@Module
public class LibraryAppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Singleton
    @Provides
    ServiceFoo provideServiceFoo(Context context) {
        return new ServiceFoo(context);
    }

    @Singleton
    @Provides
    ServiceBar provideServiceBar(Context context, ServiceFoo serviceFoo) {
        return new ServiceBar(context, serviceFoo);
    }

}