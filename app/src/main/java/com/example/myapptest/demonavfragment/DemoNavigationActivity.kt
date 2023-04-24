package com.example.myapptest.demonavfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapptest.R
import com.example.myapptest.databinding.ActivityDemoNavigationBinding

class DemoNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Charger la vue en DataBinding
        DataBindingUtil.setContentView<ActivityDemoNavigationBinding>(this, R.layout.activity_demo_navigation)
    }
}