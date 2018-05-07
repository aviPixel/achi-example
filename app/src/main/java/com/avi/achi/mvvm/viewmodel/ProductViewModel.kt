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
import com.avi.achi.mvvm.model.PhotoListItem
import com.avi.achi.mvvm.model.Product
import com.google.gson.Gson
import retrofit2.Callback

/**
 * Created by USER on 3/5/2561.
 */
class ProductViewModel() : ViewModel() {

    private val productDataLiveData = MutableLiveData<Product>()
    private val mListPhotoLiveData = MutableLiveData<PhotoListItem>()

    init {
        callDataApi()
    }

    fun setDataLiveData(productLiveData: Product) {
        this.productDataLiveData.value = productLiveData
    }

    fun getDataLiveData(): LiveData<Product> {
        return productDataLiveData
    }

    fun setListPhotoLiveData(listPhotoLiveData: PhotoListItem) {
        this.mListPhotoLiveData.value = listPhotoLiveData
    }

    fun getListPhotoLiveData(): MutableLiveData<PhotoListItem> {
        return mListPhotoLiveData
    }

    fun callDataApi() {
//        ApiInterface().createService().getAllProduct(1).enqueue(object: ApiCallback<Product>() {
//            override fun success(data: Product) {
//                Log.e("product", Gson().toJson(data))
//                setDataLiveData(data)
//            }
//
//            override fun fail(code: Int, message: String) {
//
//            }
//        })

        ApiInterface().createService().getListAllPhoto().enqueue(object: ApiCallback<PhotoListItem>() {
            override fun success(data: PhotoListItem) {
                Log.e("listPhoto", Gson().toJson(data))
                setListPhotoLiveData(data)
            }

            override fun fail(code: Int, message: String) {

            }
        })
    }

}