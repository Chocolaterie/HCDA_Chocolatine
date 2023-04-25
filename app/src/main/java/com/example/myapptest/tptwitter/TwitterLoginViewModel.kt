package com.example.myapptest.tptwitter

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.myapptest.R

class TwitterLoginViewModel : ViewModel() {

    // Contient message erreur
    var errorMessage = ""

    // Va contenir la saisie de l'email en temps réel
    var emailField = MutableLiveData<String>()

    fun validateLogin(){
        // Si au moins un champs est vide
        if (emailField.value!!.isEmpty()){
            // j'affiche un message
            errorMessage = "Veuillez saisir tous les champs"
        }
        else {
            // j'affiche un message
            errorMessage = "Saisies correctes"
            // naviguer de login fragment à list fragment
            // findNavController().navigate(R.id.action_loginTwitterFragment_to_listTwitterFragment)
        }
    }
}