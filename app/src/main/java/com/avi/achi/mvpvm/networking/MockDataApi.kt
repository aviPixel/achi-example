package com.avi.achi.mvpvm.networking

import android.util.Log
import com.avi.achi.manageapi.ApiInterface
import com.avi.achi.manageapi.ApiResponse
import com.avi.achi.mvpvm.data.MockData
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.logging.Logger

/**
 * Created by USER on 20/4/2561.
 */
interface MockDataApi : ApiInterface, Callback<ApiResponse<MockData>> {

    companion object {
        val LOG = Logger.getLogger(MockDataApi::class.java.name)
    }

    interface Endpoint {
        @GET("5ad6fe452e00000f00c93ccc")
        fun getMockData(): Call<ApiResponse<MockData>>
    }

    fun onBinding(mockData: MockData, message: String?, status: Int?)

    fun onFailureBinding(message: String?, status: Int?)

    fun getMockData(): Call<ApiResponse<MockData>> {
        val call: Call<ApiResponse<MockData>>  = initEndPoint().create(Endpoint::class.java).getMockData()
        call.enqueue(this)

        return call
    }

    override fun onResponse(call: Call<ApiResponse<MockData>>?, response: Response<ApiResponse<MockData>>?) {
        Log.e("data", Gson().toJson(response))
//        val resp = (response!!.body() as ApiResponse<MockData>)
//        onBinding(resp.data, resp.Message, resp.Status)
//        if (response!!.isSuccessful && response.body() != null && response.code() == 200) {
//
            val resp = (response!!.body() as ApiResponse<MockData>)
//
//            if (resp.Status != 200) {
//                onFailureBinding(resp.Message, resp.Status)
//                return
//            }
//
//            try {
//                onBinding(resp.data, resp.Message, resp.Status)
//            }
//            catch (e : Exception) {
//                onFailureBinding(e.message, 500)
//                e.printStackTrace()
//            }
//
//            return
//        }
//
//        onFailureBinding(response.message(), response.code())

        onBinding(resp.data, resp.Message, resp.Status)
    }

    override fun onFailure(call: Call<ApiResponse<MockData>>?, t: Throwable?) {

    }

}