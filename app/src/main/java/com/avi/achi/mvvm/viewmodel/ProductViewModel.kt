package com.avi.achi.mvvm.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import android.widget.Toast
import com.avi.achi.MainApplication
import com.avi.achi.config.toast
import com.avi.achi.mvvm.ApiService.ApiCallback
import com.avi.achi.mvvm.ApiService.ApiInterface
import com.avi.achi.mvvm.model.Product
import com.google.gson.Gson

/**
 * Created by USER on 3/5/2561.
 */
class ProductViewModel : ViewModel() {

    private val productDataLiveData = MutableLiveData<Product>()

    fun setDataLiveData(productLiveData: Product) {
        this.productDataLiveData.value = productLiveData
    }

    fun getDataLiveData(): LiveData<Product> {//MutableLiveData
        return productDataLiveData
    }

    private fun callDataApi() {
        ApiInterface().createService().getAllProduct(1).enqueue(object: ApiCallback<Product>() {
            override fun success(data: Product) {
                Log.e("product", Gson().toJson(data))
                setDataLiveData(data)
            }

            override fun fail(code: Int, message: String) {

            }
        })
    }

}