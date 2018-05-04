package com.avi.achi.mvpvm.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.avi.achi.R
import com.avi.achi.config.GlideLib
import com.avi.achi.databinding.ActivityMainMvpvmBinding
import com.avi.achi.mvpvm.data.MockData
import com.avi.achi.mvpvm.itf.IMockData
import com.avi.achi.mvpvm.presenter.MockDataPresenter
import com.avi.achi.mvpvm.viewmodel.MockDataViewModel
import kotlinx.android.synthetic.main.activity_main_mvpvm.*

class MainMVPVMActivity : AppCompatActivity(), IMockData.IView {

    private lateinit var binding: ActivityMainMvpvmBinding
    private lateinit var viewModel: MockDataViewModel
    private lateinit var presenter: MockDataPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvpvm)

        viewModel = ViewModelProviders.of(this).get(MockDataViewModel::class.java)
        presenter = MockDataPresenter(this, viewModel)

        // React to data changes on the version property
        viewModel.getDataLiveData().observe(this, Observer { mockData ->
            /**
             * Handle observe version data
             * Shows how to manually set text
             */

            binding.data = mockData


            tv_author.text =  binding.data!!.author
//            tv_title.text =  binding.data!!.title
            tv_description.text =  binding.data!!.description
            tv_url.text =  binding.data!!.url
            GlideLib.setImage(this, binding.data!!.urlToImage, iv_image)
            tv_published.text = binding.data!!.publishedAt
        })

        callMockData()

    }

    fun callMockData() {
        presenter.onViewInit()
    }

    override fun updateProgress(progress: String) {

    }

    override fun onBind(viewModel: MockDataViewModel) {
        binding.viewModel = viewModel
    }

    override fun onFailureBinding(message: String, status: Int) {

    }

}