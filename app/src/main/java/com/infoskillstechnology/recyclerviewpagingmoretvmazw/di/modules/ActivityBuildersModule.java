package com.infoskillstechnology.recyclerviewpagingmoretvmazw.di.modules;

import com.infoskillstechnology.recyclerviewpagingmoretvmazw.ui.home.HomeActivity;
import com.infoskillstechnology.recyclerviewpagingmoretvmazw.ui.shows.RecyclerViewActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract HomeActivity bindHomeActivity();

    @ContributesAndroidInjector
    abstract RecyclerViewActivity bindAllShowActivity();
}
