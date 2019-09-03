package com.dagger.example.exampleapplication.di;

import com.dagger.example.exampleapplication.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created on 2019-09-01.
 */
@Module
public abstract class ExampleApplicationActivityBuilder {

    // Could include further submodules via the @ContributesAndroidInjector, but not necessary at the moment
    @ContributesAndroidInjector/*(modules = { MyNotImplementedExampleActivityModule.class } */
    abstract MainActivity bindMainActivity();
}