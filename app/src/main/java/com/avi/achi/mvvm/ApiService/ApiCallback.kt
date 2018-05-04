package com.avi.achi.mvvm.ApiService

import com.avi.achi.config.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.HttpException

/**
 * Created by USER on 3/5/2561.
 */
abstract class ApiCallback<T>: Callback<T> {

    override fun onResponse(call: Call<T>?, response: Response<T>?) {
        success(response!!.body()!!)
    }

    override fun onFailure(call: Call<T>?, t: Throwable?) {
        if (t!!.message!!.contains("Unable to resolve host")) {
            fail(500, "Internet problem")
        } else {
            fail((t as HttpException).code(), t.message())
        }
    }

    abstract fun success(data: T)
    abstract fun fail(code: Int, message: String)

}