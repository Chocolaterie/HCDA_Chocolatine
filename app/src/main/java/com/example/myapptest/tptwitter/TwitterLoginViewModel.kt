package com.example.myapptest.tptwitter

import android.graphics.Color
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.myapptest.R

class TwitterLoginViewModel : ViewModel() {

    // Pour refresh l'ui
    var refreshUI = MutableLiveData<Boolean>();

    // Savoir quand le connexion est valide
    var loginSuccess = MutableLiveData<Boolean>(false);

    // Contient message erreur
    var errorMessage = ""

    // Va contenir la saisie de l'email en temps réel
    var emailField = MutableLiveData<String>()
    var passwordField = MutableLiveData<String>()

    var colorMessage = Color.parseColor("#FF0000");

    fun forceRefreshUI(){
        // Forcer à appeler l'evenement
        refreshUI.value = true;
    }

    fun validateLogin(){
        // Si au moins un champs est vide
        if (emailField.value.isNullOrEmpty() && passwordField.value.isNullOrEmpty() && !loginSuccess.value!! ){
            // j'affiche un message
            errorMessage = "Veuillez saisir tous les champs"

            colorMessage = Color.parseColor("#0000FF");

            // Error login
            loginSuccess.value = false
        }
        else {
            // j'affiche un message
            errorMessage = "Saisies correctes"

            // En vert
            colorMessage = Color.parseColor("#51D24D");

            // Ok login success
            loginSuccess.value = true
        }

        // Dans tout les cas refresh l'interface
        forceRefreshUI();
    }
}