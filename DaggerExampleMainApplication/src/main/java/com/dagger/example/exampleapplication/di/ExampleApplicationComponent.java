package com.dagger.example.exampleapplication.di;

import android.app.Application;

import com.dagger.example.daggerexamplelibrary.di.LibraryAppModule;
import com.dagger.example.exampleapplication.ExampleApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.android.support.DaggerApplication;

/**
 * Created on 2019-08-30.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class, /** Could also be AndroidInjectionModule.class if don't care about support lib */
        LibraryAppModule.class,
        ExampleApplicationActivityBuilder.class /** Necessary for injection in our activit(ies) **/
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