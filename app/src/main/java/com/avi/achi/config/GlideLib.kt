package com.avi.achi.config

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target

/**
 * Created by USER on 19/4/2561.
 */
class GlideLib {

    companion object {

        private val options = RequestOptions()
                .format(DecodeFormat.PREFER_ARGB_8888)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .placeholder(R.drawable.img_placeholder)
//                .error(R.drawable.img_error);

        /**
         *  image drawable
         */
        fun setImage(context: Context, resId: Int, imageview: ImageView) {
            Glide.with(context)
                    .load(resId)
                    .transition(withCrossFade())
                    .apply(options)
                    .into(imageview)
        }

        /**
         *
         */
        fun setImagea(context: Context, url: String, imageview: ImageView) {
            Glide.with(context)
                    .load(url)
                    .transition(withCrossFade())
                    .apply(options)
                    .into(imageview)
        }

        fun setImage(context: Context, url: String, imageview: ImageView) {
            Glide.with(context)
                    .load(url)
                    .transition(withCrossFade())
                    .apply(options)
                    .into(imageview)
        }

        /**
         * progressbar
         */
        fun setImage(context: Context, resId: Int, imageview: ImageView, progressBar: ProgressBar) {
            Glide.with(context)
                    .load(resId)
                    .listener(object : RequestListener<Drawable> {
                        override fun onLoadFailed(e: GlideException?, model: Any, target: Target<Drawable>, isFirstResource: Boolean): Boolean {
                            progressBar.visibility = View.GONE
                            return false
                        }

                        override fun onResourceReady(resource: Drawable, model: Any, target: Target<Drawable>, dataSource: DataSource, isFirstResource: Boolean): Boolean {
                            progressBar.visibility = View.GONE
                            return false
                        }
                    })
                    .transition(withCrossFade())
                    .apply(options)
                    .into(imageview)
        }

        fun setImage(context: Context, url: String, imageview: ImageView, progressBar: ProgressBar) {
            Glide.with(context)
                    .load(url)
                    .listener(object : RequestListener<Drawable> {
                        override fun onLoadFailed(e: GlideException?, model: Any, target: Target<Drawable>, isFirstResource: Boolean): Boolean {
                            progressBar.visibility = View.GONE
                            return false
                        }

                        override fun onResourceReady(resource: Drawable, model: Any, target: Target<Drawable>, dataSource: DataSource, isFirstResource: Boolean): Boolean {
                            progressBar.visibility = View.GONE
                            return false
                        }
                    })
                    .transition(withCrossFade())
                    .apply(options)
                    .into(imageview)
        }
    }

}