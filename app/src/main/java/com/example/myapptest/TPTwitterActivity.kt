package com.example.myapptest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class TPTwitterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tptwitter)

    }

    // Que faire lors du clique sur le bouton Connexion
    fun onClickLogin(view: View) {
        // Récupèrer les champs
        val edtEmail = findViewById<EditText>(R.id.edt_email)
        val edtPassword = findViewById<EditText>(R.id.edt_paswword)

        // je récupère le text view
        val tvFormMessage = findViewById<TextView>(R.id.tv_form_message)

        // Si au moins un champs est vide
        if (edtEmail.text.isEmpty() || edtPassword.text.isEmpty()){
            //j'affiche un message
            tvFormMessage.text = "Veuillez saisir tous les champs"
            tvFormMessage.setTextColor(Color.parseColor("#FF0000"))
        }
        else {
            // j'affiche un message
            tvFormMessage.text = "Saisies correctes"
        }
    }
}