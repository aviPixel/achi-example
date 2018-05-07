package com.avi.achi.mvvm.view.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.DataBindingUtil.inflate
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.avi.achi.R
import com.avi.achi.databinding.ViewholderEmptyBinding
import com.avi.achi.databinding.ViewholderListPhotoBinding
import com.avi.achi.mvvm.model.PhotoItemDetail
import com.avi.achi.mvvm.model.PhotoListItem

/**
 * Created by USER on 3/5/2561.
 */
class ProductAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val VIEW_ITEM = 1
    private val VIEW_EMPTY = 0

    private var mListData: List<PhotoItemDetail>? = null
    private lateinit var mContext: Context

//    fun ProductAdapter(context: Context, data: ArrayList<PhotoItemDetail>) {
//        this.mContext = context
//        this.mListData = data
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_ITEM) {
            val binding = DataBindingUtil.inflate<ViewholderListPhotoBinding>(LayoutInflater.from(parent.context), R.layout.viewholder_list_photo, parent,false)
            ItemViewHolder(binding)
        }
        else {
            val binding = DataBindingUtil.inflate<ViewholderEmptyBinding>(LayoutInflater.from(parent.context), R.layout.viewholder_empty, parent,false)
            ViewHolderEmpty(binding)
        }
    }

    override fun getItemCount(): Int {
        if (mListData == null) {
            return 0
        }
        return mListData!!.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder) {
            val item = mListData!![position]
            holder.viewholderListPhotoBinding!!.photoItemDetail = item
            holder.bind()
        }
        else if (holder is ViewHolderEmpty) {
            holder.viewholderEmptyBinding!!.empty
            holder.bind()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (mListData!!.get(position) != null) VIEW_ITEM else VIEW_EMPTY
    }

    fun setDataItem(photoListItem: List<PhotoItemDetail>?) {
        this.mListData = photoListItem
        notifyDataSetChanged()
    }

    inner class ItemViewHolder(binding: ViewholderListPhotoBinding) : RecyclerView.ViewHolder(binding.root) {

        var viewholderListPhotoBinding: ViewholderListPhotoBinding?

        init {
            viewholderListPhotoBinding = DataBindingUtil.bind(itemView)
        }

        fun bind() {
            viewholderListPhotoBinding!!.executePendingBindings()
        }
    }

}