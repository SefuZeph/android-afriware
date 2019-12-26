package com.example.android.android_afriware

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.example.android.android_afriware.database.AppDatabaseModule
import com.example.android.android_afriware.injection.DaggerAfriComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import timber.log.Timber
import javax.inject.Inject

class AfriApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()
        // set up error reporting
        Timber.plant(Timber.DebugTree())

        // set up dagger android injection
        DaggerAfriComponent.builder()
            .appDatabaseModule(AppDatabaseModule(this))
            .build()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }
}