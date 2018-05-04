package com.avi.achi.config

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View

/**
 * Created by USER on 19/4/2561.
 */
class BundleSaveState : View.BaseSavedState {

    private var bundle = Bundle()

    constructor(source: Parcel) : super(source) {
        bundle = source.readBundle()
    }

    @TargetApi(Build.VERSION_CODES.N)
    constructor(source: Parcel, loader: ClassLoader) : super(source, loader)

    constructor(superState: Parcelable) : super(superState)

    fun getBundle(): Bundle {
        return bundle
    }

    override fun writeToParcel(out: Parcel?, flags: Int) {
        super.writeToParcel(out, flags)
    }

    companion object {

        val CREATOR = object : Parcelable.Creator<BundleSaveState> {
            override fun createFromParcel(source: Parcel): BundleSaveState {
                return BundleSaveState(source)
            }

            override fun newArray(size: Int): Array<BundleSaveState?> {
                return arrayOfNulls(size)
            }
        }

    }

}