package com.example.myapptest.demonav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapptest.R

class DemoNavTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_nav_two)
    }

    // Bouton pour relancer une nouvelle Activité DemoNavOne
    fun onClickOpenOneActivity(view: View) {
        // Préparer l'action pour ouvrir une Activity
        val intent = Intent(this, DemoNavOneActivity::class.java)
        // Executer ce type action (pour ouvrir une Activity) à l'aide de startActivity
        startActivity(intent)
    }

    // Bouton  fermer toute les activités de la pile jusqu'a la première
    fun onClickCloseAllToRoot(view: View) {
        // Préparer l'action pour tout fermer jusqu'a l'activité par défaut
        val intent = Intent(this, DemoNavOneActivity::class.java)
        // Lui donner l'information
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // Executer ce type action (pour ouvrir une Activity) à l'aide de startActivity
        startActivity(intent)
    }
}