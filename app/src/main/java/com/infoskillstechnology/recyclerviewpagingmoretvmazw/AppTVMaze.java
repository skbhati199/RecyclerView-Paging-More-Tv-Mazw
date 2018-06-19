package com.infoskillstechnology.recyclerviewpagingmoretvmazw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.infoskillstechnology.recyclerviewpagingmoretvmazw.di.AppComponent;
import com.infoskillstechnology.recyclerviewpagingmoretvmazw.di.AppInjector;
import com.infoskillstechnology.recyclerviewpagingmoretvmazw.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class AppTVMaze extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    private AppComponent appComponent;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().application(this)
                .build();
        appComponent.inject(this);
        AppInjector.init(this);

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    /**
     * Returns an {@link AndroidInjector} of {@link Activity}s.
     */
    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
