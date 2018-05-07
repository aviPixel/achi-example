package com.avi.achi.mvvm.ApiService

import com.avi.achi.mvvm.model.PhotoListItem
import com.avi.achi.mvvm.model.Product
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by USER on 3/5/2561.
 */
interface ApiEndpointInterface {

    @GET("products")
    fun getAllProduct(@Query("page") per_page: Int): Call<Product>

    @POST("list")
    fun getListAllPhoto(): Call<PhotoListItem>

    @POST("list/after/{id}")
    fun getPhotoAfterId(@Path("id") id: Int): Call<PhotoListItem>

    @POST("list/before/{id}")
    fun getPhotoBeforeId(@Path("id") id: Int): Call<PhotoListItem>

}