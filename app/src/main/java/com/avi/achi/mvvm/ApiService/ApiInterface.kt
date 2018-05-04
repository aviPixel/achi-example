package com.avi.achi.mvvm.ApiService

import com.avi.achi.config.Constance
import com.avi.achi.mvpvm.networking.MockDataApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit


/**
 * Created by USER on 19/4/2561.
 */
class ApiInterface {

    private fun setTimeOutApi(): OkHttpClient {
        return OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .build()
    }

    fun createService(): ApiEndpointInterface {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://lcboapi.com/")//Constance.BASE_URL
                .client(setTimeOutApi())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        return retrofit.create(ApiEndpointInterface::class.java)
    }

    fun createService(url: String): ApiEndpointInterface {
        val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .client(setTimeOutApi())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        return retrofit.create(ApiEndpointInterface::class.java)
    }


}