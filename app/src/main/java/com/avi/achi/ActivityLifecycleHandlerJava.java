package com.avi.achi;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.avi.achi.config.SingletonApp;

/**
 * Created by pia on 2/11/2017 AD.
 */

public class ActivityLifecycleHandlerJava implements Application.ActivityLifecycleCallbacks {

    public interface LifecycleListener {
        void onApplicationStopped();
        void onApplicationStarted(Activity activity);
        void onApplicationPaused();
        void onApplicationResumed(Activity activity);
        void onActivityStart(Activity activity);
    }

    private LifecycleListener listener;
    private int started;
    private int resumed;
    private boolean transitionPossible;

    public ActivityLifecycleHandlerJava(LifecycleListener listener) {
        this.listener = listener;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityStarted(Activity activity) {
//        SingletonApp.Companion.getInstance().setCurrentContext(activity);
        listener.onActivityStart(activity);

        if (started == 0 && listener != null)
            listener.onApplicationStarted(activity);
        started++;
    }

    @Override
    public void onActivityResumed(Activity activity) {
        if (resumed == 0 && !transitionPossible && listener != null)
            listener.onApplicationResumed(activity);
        transitionPossible = false;
        resumed++;
    }

    @Override
    public void onActivityPaused(Activity activity) {
        transitionPossible = true;
        resumed--;
    }

    @Override
    public void onActivityStopped(Activity activity) {
        if (started == 1 && listener != null) {
            // We only know the application was paused when it's stopped (because transitions always pause activities)
            // http://developer.android.com/guide/components/activities.html#CoordinatingActivities
            if (transitionPossible && resumed == 0)
                listener.onApplicationPaused();
            listener.onApplicationStopped();
        }
        transitionPossible = false;
        started--;
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }

}