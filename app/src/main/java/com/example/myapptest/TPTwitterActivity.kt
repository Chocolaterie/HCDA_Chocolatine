package com.example.myapptest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapptest.databinding.ActivityTptwitterBinding

class TPTwitterActivity : AppCompatActivity() {

    private lateinit var attd : ActivityTptwitterBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        attd = DataBindingUtil.setContentView<ActivityTptwitterBinding>(this, R.layout.activity_tptwitter)
    }

    // Que faire lors du clique sur le bouton Connexion
    fun onClickLogin(view: View) {
        // Si au moins un champs est vide
        if (attd.edtEmail.text.isEmpty() || attd.edtPaswword.text.isEmpty()){
            //j'affiche un message
            attd.tvFormMessage.text = "Veuillez saisir tous les champs"
            attd.tvFormMessage.setTextColor(Color.parseColor("#FF0000"))
        }
        else {
            // j'affiche un message
            attd.tvFormMessage.text = "Saisies correctes"
        }
    }
}