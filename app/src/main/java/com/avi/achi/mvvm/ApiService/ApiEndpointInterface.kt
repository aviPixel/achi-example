package com.avi.achi.mvvm.ApiService

import com.avi.achi.mvvm.model.Product
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

/**
 * Created by USER on 3/5/2561.
 */
interface ApiEndpointInterface {

    @GET("products")
    fun getAllProduct(@Query("page") per_page: Int): Call<Product>
}