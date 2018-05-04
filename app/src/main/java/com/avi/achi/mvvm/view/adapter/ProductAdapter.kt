package com.avi.achi.mvvm.view.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.avi.achi.mvvm.model.ProductDetail
import java.util.ArrayList

/**
 * Created by USER on 3/5/2561.
 */
class ProductAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val VIEW_ITEM = 1
    private val VIEW_EMPTY = 0

    private var mListData: ArrayList<ProductDetail>? = null
    private lateinit var mContext: Context

    fun ProductAdapter(context: Context, data: ArrayList<ProductDetail>) {
        this.mContext = context
        this.mListData = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        if (viewType == VIEW_ITEM) {
//            val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_whatson_city, parent, false)
//            return MenuViewHolder(view)
//        } else {
//            val view = LayoutInflater.from(parent.context).inflate(R.layout.view_null, parent, false)
//            return ViewEmpty(view)
//        }
//        val binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.product_item, parent, false)
//        return ProductViewHolder(binding)
        TODO()
    }

    override fun getItemCount(): Int {
        TODO()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO()
    }

    override fun getItemViewType(position: Int): Int {
        return if (mListData!!.get(position) != null) VIEW_ITEM else VIEW_EMPTY
    }

}