package com.avi.achi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.avi.achi.mvpvm.view.MainMVPVMActivity
import com.avi.achi.mvvm.view.activity.MainMVVMActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMVPVM.text = "MVPVM"
        btnMVPVM.setOnClickListener(this)
        btnMVVM.text = "MVVM"
        btnMVVM.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            btnMVPVM.id -> {
                val intent = Intent(this, MainMVPVMActivity::class.java)
                startActivity(intent)
            }
            btnMVVM.id -> {
                val intent = Intent(this, MainMVVMActivity::class.java)
                startActivity(intent)
            }
            else -> {

            }
        }
    }

}