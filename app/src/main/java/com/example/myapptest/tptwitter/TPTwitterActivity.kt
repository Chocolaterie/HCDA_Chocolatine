package com.example.myapptest.tptwitter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapptest.R
import com.example.myapptest.databinding.ActivityTptwitterBinding

class TPTwitterActivity : AppCompatActivity() {

    private lateinit var attd : ActivityTptwitterBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        attd = DataBindingUtil.setContentView<ActivityTptwitterBinding>(this,
            R.layout.activity_tptwitter
        )
    }

}