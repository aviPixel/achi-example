package com.avi.achi.mvpvm.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.avi.achi.mvpvm.data.MockData

/**
 * Created by USER on 20/4/2561.
 */
class MockDataViewModel : ViewModel() {

    private val mockDataLiveData = MutableLiveData<MockData>()

    fun setDataLiveData(versionLiveData: MockData){
        this.mockDataLiveData.value = versionLiveData
    }

    fun getDataLiveData(): LiveData<MockData>{
        return mockDataLiveData
    }

    fun getTitle(): String{
        return mockDataLiveData.value!!.title
    }

}