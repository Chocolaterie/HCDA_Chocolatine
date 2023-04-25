package com.example.myapptest.demomoyenneviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.myapptest.R
import com.example.myapptest.databinding.ActivityDemoMoyenneVmactivityBinding
import kotlinx.coroutines.launch

class DemoMoyenneVMActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Je récupère ma vue
        val maVue = DataBindingUtil.setContentView<ActivityDemoMoyenneVmactivityBinding>(this, R.layout.activity_demo_moyenne_vmactivity)

        // Charge mon view model (instance)
        val moyenneViewModel = MoyenneClassroomViewModel()

        // Mettre le view model dans la vue
        maVue.moyenneViewModel = moyenneViewModel

        // Que faire lorsque je detecte le changement d'une valeur
        moyenneViewModel.refreshUI.observe(this, Observer {
            // Rafraichir
            maVue.moyenneViewModel = moyenneViewModel
        })

    }
}