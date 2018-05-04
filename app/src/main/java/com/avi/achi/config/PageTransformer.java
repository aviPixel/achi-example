package com.avi.achi.config;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.avi.achi.R;

public class PageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(@NonNull View page, float position) {
        page.findViewById(R.id.iv_gallery).setTranslationX(-position * (page.getWidth() / 2));
    }
}