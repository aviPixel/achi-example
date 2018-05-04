package com.avi.achi.manageapi

import com.avi.achi.config.Constance
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by USER on 19/4/2561.
 */
interface ApiInterface {

    fun initEndPoint(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(Constance.BASE_URL)
                .addConverterFactory(ToStringConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun initEndPoint(url: String): Retrofit {
        return Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(ToStringConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

}