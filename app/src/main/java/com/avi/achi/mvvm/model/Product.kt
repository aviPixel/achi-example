package com.avi.achi.mvvm.model

import android.databinding.BaseObservable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.parceler.Parcel
import java.util.ArrayList

/**
 * Created by USER on 3/5/2561.
 */
@Parcel
data class Product (
        @SerializedName("status")
        var status: Int,
        @SerializedName("message")
        var message: String,
        @SerializedName("result")
        var productDetailList: ArrayList<ProductDetail>?
): BaseObservable() {

    constructor() : this(0, "", null)
}