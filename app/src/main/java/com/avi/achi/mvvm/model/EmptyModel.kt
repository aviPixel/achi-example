package com.avi.achi.mvvm.model

import android.databinding.BaseObservable
import com.google.gson.annotations.SerializedName
import org.parceler.Parcel

/**
 * Created by USER on 4/5/2561.
 */
@Parcel
data class EmptyModel(
        @SerializedName("empty")               var empty: String

) : BaseObservable() {

    constructor() : this("")
}