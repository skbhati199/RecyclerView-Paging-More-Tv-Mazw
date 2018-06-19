package com.infoskillstechnology.recyclerviewpagingmoretvmazw.di;


import android.app.Application;

import com.infoskillstechnology.recyclerviewpagingmoretvmazw.AppTVMaze;
import com.infoskillstechnology.recyclerviewpagingmoretvmazw.di.modules.ActivityBuildersModule;
import com.infoskillstechnology.recyclerviewpagingmoretvmazw.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuildersModule.class})
public interface AppComponent {

    void inject(AppTVMaze appTVMaze);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
