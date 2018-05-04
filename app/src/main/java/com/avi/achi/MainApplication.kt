package com.avi.achi

import android.app.Activity
import android.app.Application

/**
 * Created by USER on 19/4/2561.
 */
class MainApplication : Application(), ActivityLifecycleHandlerJava.LifecycleListener {

    init {
        instance = this
    }

    companion object {
        private var instance: MainApplication? = null

        fun applicationContext() : MainApplication {
            return instance!!
        }
    }

    override fun onCreate() {
        super.onCreate()

        registerActivityLifecycleCallbacks(ActivityLifecycleHandlerJava(this))
    }

    override fun onActivityStart(activity: Activity?) {
    }

    override fun onApplicationStarted(activity: Activity) {
    }

    override fun onApplicationStopped() {
    }

    override fun onApplicationPaused() {
    }

    override fun onApplicationResumed(activity: Activity) {
    }

}