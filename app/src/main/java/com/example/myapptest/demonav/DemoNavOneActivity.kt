package com.example.myapptest.demonav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapptest.R

class DemoNavOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_nav_one)
    }

    fun onClickRepasQuiTue(view: View) {
        // Préparer l'action pour ouvrir une Activity
        val intent = Intent(this, DemoNavTwoActivity::class.java)
        // Executer ce type action (pour ouvrir une Activity) à l'aide de startActivity
        startActivity(intent)
    }
}