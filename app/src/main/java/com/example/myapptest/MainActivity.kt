package com.example.myapptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récuperer le champ Email
        val edtEmail = findViewById<EditText>(R.id.edt_email)
        println(edtEmail.text)

        // Text view
        val tvExample = findViewById<TextView>(R.id.tv_example)

        tvExample.text = "Toto";

        // Méthode 1 = Définir l'action d'un clique sur le boutton
        val btnPizza = findViewById<Button>(R.id.btn_pizza)

        btnPizza.setOnClickListener {
            println("J'ai cliqué !")
        }

    }

    // Méthode 2 : Le XML pointe sur cette méthode
    fun OnClickButtonCrevette(view: View) {
        val tvExample = findViewById<TextView>(R.id.tv_example)

        tvExample.text = "Oups j'ai attrapé une intoxication alimentaire"
    }
}