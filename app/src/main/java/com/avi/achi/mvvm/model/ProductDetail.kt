package com.avi.achi.mvvm.model

import android.databinding.BaseObservable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.parceler.Parcel

/**
 * Created by USER on 3/5/2561.
 */
@Parcel
data class ProductDetail (
        @SerializedName("id")
        var id: Int,
        @SerializedName("is_dead")
        var is_dead: Boolean,
        @SerializedName("name")
        var name: String,
        @SerializedName("tags")
        var tags: String,
        @SerializedName("origin")
        var origin: String,
        @SerializedName("varietal")
        var varietal: String,
        @SerializedName("style")
        var style: String,
        @SerializedName("price_in_cents")
        var price_in_cents: Int,
        @SerializedName("regular_price_in_cents")
        var regular_price_in_cents: Int,
        @SerializedName("stock_type")
        var stock_type: String,
        @SerializedName("primary_category")
        var primary_category: String,
        @SerializedName("secondary_category")
        var secondary_category: String,
        @SerializedName("alcohol_content")
        var alcohol_content: Int,
        @SerializedName("image_thumb_url")
        var image_thumb_url: String,
        @SerializedName("image_url")
        var image_url: String,
        @SerializedName("product_no")
        var product_no: Int
    ): BaseObservable() {
        constructor() : this(0, false, "", "", "", "", "", 0, 0,
                "", "", "" , 0, "", "", 0)
}