package com.crazysunj.crazydaily.di.component;


import android.content.Context;

import com.crazysunj.crazydaily.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Context provideContext();

}
