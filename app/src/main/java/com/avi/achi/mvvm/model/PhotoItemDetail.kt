package com.avi.achi.mvvm.model

import android.databinding.BaseObservable
import com.google.gson.annotations.SerializedName
import org.parceler.Parcel
import java.util.*

/**
 * Created by USER on 4/5/2561.
 */
@Parcel
data class PhotoItemDetail(
        @SerializedName("id")               var id: Int,
        @SerializedName("link")             var link: String,
        @SerializedName("image_url")        var imageUrl: String,
        @SerializedName("caption")          var caption: String,
        @SerializedName("user_id")          var userId: Int,
        @SerializedName("username")         var userName: String,
        @SerializedName("profile_picture")  var profilePicture: String,
        @SerializedName("tags")             var tags: List<String>?,
        @SerializedName("created_time")     var createdTime: Date?,
        @SerializedName("camera")           var camera: String,
        @SerializedName("lens")             var lens: String,
        @SerializedName("focal_length")     var focalLength: String,
        @SerializedName("iso")              var iso: String,
        @SerializedName("shutter_speed")    var shutterSpeed: String,
        @SerializedName("aperture")         var aperture: String

        ) : BaseObservable() {

    constructor() : this(0,"","","",0,"","",
            null,null,"","","","","","")
}