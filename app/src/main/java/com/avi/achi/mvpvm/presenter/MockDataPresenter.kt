package com.avi.achi.mvpvm.presenter

import com.avi.achi.mvpvm.data.MockData
import com.avi.achi.mvpvm.itf.IMockData
import com.avi.achi.mvpvm.networking.MockDataApi
import com.avi.achi.mvpvm.viewmodel.MockDataViewModel
import kotlin.properties.Delegates

/**
 * Created by USER on 2/5/2561.
 */
class MockDataPresenter(iView: IMockData.IView, viewModel: MockDataViewModel): MockDataApi, IMockData.IPresenter {

    private var iView: IMockData.IView by Delegates.notNull()
    private var viewModel: MockDataViewModel by Delegates.notNull()

    /**
     * Internal presenter cache to store version data
     */
    private val versionCache: MutableList<MockData> = mutableListOf()

    init {
        this.iView = iView
        this.viewModel = viewModel
    }

    override fun onBinding(mockData: MockData, message: String?, status: Int?) {
        versionCache.add(mockData)
        iView.updateProgress("updateProgress")
        viewModel.setDataLiveData(mockData)

        iView.onBind(viewModel)
    }

    override fun onFailureBinding(message: String?, status: Int?) {
        iView.updateProgress(message!!)
        iView.onFailureBinding(message, status!!)
    }

    override fun onViewInit() {
        iView.updateProgress("updateProgress")
        getMockData()
    }

}