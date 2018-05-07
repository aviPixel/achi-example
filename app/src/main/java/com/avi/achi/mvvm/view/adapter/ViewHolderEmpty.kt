package com.avi.achi.mvvm.view.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import com.avi.achi.databinding.ViewholderEmptyBinding

/**
 * Created by USER on 3/5/2561.
 */
class ViewHolderEmpty(binding: ViewholderEmptyBinding) : RecyclerView.ViewHolder(binding.root) {

    var viewholderEmptyBinding: ViewholderEmptyBinding?

    init {
        viewholderEmptyBinding = DataBindingUtil.bind(itemView)
    }

    fun bind() {
        viewholderEmptyBinding!!.executePendingBindings()
    }

}