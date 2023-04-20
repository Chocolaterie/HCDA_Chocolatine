package com.example.myapptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapptest.databinding.ActivityMainBinding
import com.example.myapptest.entity.Person

class MainActivity : AppCompatActivity() {

    lateinit var amd : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        amd = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // Transférer une personne dans la vue DataBindé
        amd.person = Person("Gildas")

    }
}