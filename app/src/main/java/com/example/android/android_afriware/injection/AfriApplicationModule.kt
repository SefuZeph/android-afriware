package com.example.android.android_afriware.injection

import com.example.android.android_afriware.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AfriApplicationModule {
    @ContributesAndroidInjector
    fun contributeMainActivityInjector(): MainActivity
}