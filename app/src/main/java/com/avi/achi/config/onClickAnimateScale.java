package com.avi.achi.config;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;

import com.avi.achi.R;

public class onClickAnimateScale {

//    public onClickAnimateScale (View view) {
//        view.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        v.animate().cancel();
//                        /**
//                         * ย่อ View ลงไป 96% ในเวลา 200 ms
//                         */
//                        v.animate().scaleY(0.96f).scaleX(0.96f).setDuration(200).start();
//                        View img = v.findViewById(R.id.fab);
//                        /**
//                         * image จะขยายขึ้น 10% และค่าความจางเหลือเพียง 70% ในกรณี
//                         */
//                        img.animate().scaleY(1.1f).scaleX(1.1f).setDuration(200).start();
////                        img.animate().scaleY(1.4f).scaleX(1.4f).alpha(0.7f).setDuration(200).start();
//                        return false;
//                    case MotionEvent.ACTION_UP:
//                        ObjectAnimator xBigScale = ObjectAnimator.ofFloat(v, "scaleX", 1.03f);
//                        xBigScale.setDuration(160).setRepeatCount(0);
//
//                        ObjectAnimator yBigScale = ObjectAnimator.ofFloat(v, "scaleY", 1.03f);
//                        yBigScale.setDuration(160).setRepeatCount(0);
//
//                        ObjectAnimator xSmallScale = ObjectAnimator.ofFloat(v, "scaleX", 0.985f);
//                        xSmallScale.setDuration(140).setRepeatCount(0);
//
//                        ObjectAnimator ySmallScale = ObjectAnimator.ofFloat(v, "scaleY", 0.985f);
//                        ySmallScale.setDuration(140).setRepeatCount(0);
//
//                        ObjectAnimator xNormalScale = ObjectAnimator.ofFloat(v, "scaleX", 1f);
//                        xNormalScale.setDuration(70).setRepeatCount(0);
//
//                        ObjectAnimator yNormalScale = ObjectAnimator.ofFloat(v, "scaleY", 1f);
//                        yNormalScale.setDuration(70).setRepeatCount(0);
//
//                        AnimatorSet animateSet = new AnimatorSet();
//                        animateSet.play(xBigScale).with(yBigScale);
//                        animateSet.play(xSmallScale).after(xBigScale);
//                        animateSet.play(ySmallScale).after(yBigScale);
//                        animateSet.play(xNormalScale).after(xSmallScale);
//                        animateSet.play(yNormalScale).after(ySmallScale);
//                        animateSet.start();
//
//                        View img3 = v.findViewById(R.id.fab);
//
//                        img3.animate().scaleY(1f).scaleX(1f).alpha(1f).setDuration(430).start();
//                        return false;
//                    case MotionEvent.ACTION_CANCEL:
//                        View img2 = v.findViewById(R.id.fab);
//                        v.animate().scaleY(1f).scaleX(1f).setDuration(200).start();
//                        img2.animate().scaleY(1f).scaleX(1f).alpha(1f).setDuration(430).start();
//
//                        return true;
//                    default:
//                        return true;
//
//                }
//
//            }
//        });
//    }

}