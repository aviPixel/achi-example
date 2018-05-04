package com.avi.achi.config

import android.content.Context

/**
 * Created by USER on 19/4/2561.
 */
class SingletonApp {

    companion object {

        private val ourInstance = SingletonApp()
        fun getInstance(): SingletonApp {
            return ourInstance
        }
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