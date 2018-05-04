package com.avi.achi.mvpvm.data
import android.databinding.BaseObservable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.parceler.Parcel
import java.io.Serializable

/**
 * Created by USER on 19/4/2561.
 */
//@Parcel(Parcel.Serialization.BEAN)
data class MockData(
        var source: Source?,
        var author: String,
        var title: String,
        var description: String,
        var url: String,
        var urlToImage: String,
        var publishedAt: String
        ): BaseObservable() {
//    var source: Source? = null
//    var author: String? = null
//    var title: String? = null
//    var description: String? = null
//    var url: String? = null
//    var urlToImage: String? = null
//    var publishedAt: String? = null

    constructor() : this(null, "", "", "", "", "", "")

//    @Parcel(Parcel.Serialization.BEAN)
    data class Source(
        var id: Source?,
        var name: String?
        ): BaseObservable() {
//        var id: Source? = null
//        var name: String? = null

        constructor() : this(null, null)
    }

}
//@Parcel
//class MockData {
//    @SerializedName("source")
//    @Expose
//    var source: Source? = null
//    @SerializedName("author")
//    @Expose
//    var author: String? = null
//    @SerializedName("title")
//    @Expose
//    var title: String? = null
//    @SerializedName("description")
//    @Expose
//    var description: String? = null
//    @SerializedName("url")
//    @Expose
//    var url: String? = null
//    @SerializedName("urlToImage")
//    @Expose
//    var urlToImage: String? = null
//    @SerializedName("publishedAt")
//    @Expose
//    var publishedAt: String? = null
//
//    @Parcel
//    class Source {
//        @SerializedName("id")
//        @Expose
//        var id: String? = null
//        @SerializedName("name")
//        @Expose
//        var name: String? = null
//    }
//
//}