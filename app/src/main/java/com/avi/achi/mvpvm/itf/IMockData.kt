package com.avi.achi.mvpvm.itf

import com.avi.achi.mvpvm.viewmodel.MockDataViewModel

/**
 * Created by USER on 19/4/2561.
 */
interface IMockData {

    interface IView {
        fun updateProgress(progress: String)

        /**
         * Provides handle bind with VersionViewModel case
         */
        fun onBind(viewModel: MockDataViewModel)

//        /**
//         * Provides handle bind with data binding case
//         */
//        fun onBind()

        /**
         * Provides handle failure binding case
         */
        fun onFailureBinding(message: String, status: Int)
    }

    interface IPresenter {
        /**
         * Provides initiate of view
         */
        fun onViewInit()
    }
}