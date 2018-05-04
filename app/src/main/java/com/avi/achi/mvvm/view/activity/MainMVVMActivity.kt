package com.avi.achi.mvvm.view.activity

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.avi.achi.R
import com.avi.achi.databinding.ActivityMainMvvmBinding
import com.avi.achi.mvvm.view.adapter.ProductAdapter
import com.avi.achi.mvvm.viewmodel.ProductViewModel
import kotlinx.android.synthetic.main.activity_main_mvvm.*

/**
 * Created by USER on 3/5/2561.
 */
class MainMVVMActivity : AppCompatActivity() {

    private lateinit var viewModel: ProductViewModel
    private lateinit var binding: ActivityMainMvvmBinding

    private var recyclerAdapter: ProductAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvvm)
        viewModel = ViewModelProviders.of(this).get(ProductViewModel::class.java)

        initView()
        getDataProduct()
    }

    private fun getDataProduct() {

    }

    private fun initView() {
        progress_bar.visibility = View.VISIBLE

        swipe_refresh.isEnabled = true
        swipe_refresh.setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener {
            getDataProduct()
            swipe_refresh.isEnabled = false
        })

        recyclerView.layoutManager = LinearLayoutManager(this@MainMVVMActivity)
        recyclerAdapter = ProductAdapter()
        recyclerView.adapter = recyclerAdapter
    }

}