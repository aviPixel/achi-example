package com.avi.achi.mvvm.model

import android.databinding.BaseObservable
import com.google.gson.annotations.SerializedName
import org.parceler.Parcel
import java.util.*

/**
 * Created by USER on 4/5/2561.
 */
@Parcel
data class PhotoListItem(
        @SerializedName("success")          var success: Boolean,
        @SerializedName("data")             var data: List<PhotoItemDetail>?
        ) : BaseObservable() {

    constructor() : this(false,null)
}