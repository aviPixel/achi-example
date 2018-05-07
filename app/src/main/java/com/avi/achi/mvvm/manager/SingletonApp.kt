package com.avi.achi.mvvm.manager

import android.content.Context

/**
 * Created by USER on 7/5/2561.
 */
class SingletonApp {

    private var instance = SingletonApp()

    fun getInstance(): SingletonApp {
        if (instance == null)
            instance = SingletonApp()
        return instance
    }

    private var mContext: Context? = null
    fun getCurrentContext(): Context? {
        return mContext
    }

    fun setCurrentContext(mContext: Context) {
        this.mContext = mContext
    }

    private var mCurrentFragment: String? = null
    fun getCurrentFragment(): String? {
        return mCurrentFragment
    }

    fun setCurrentFragment(mCurrentFragment: String) {
        this.mCurrentFragment = mCurrentFragment
    }

}