package com.example.myapptest.demomoyenneviewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MoyenneClassroomViewModel : ViewModel() {

    // Pour refresh l'ui
    var refreshUI = MutableLiveData<Boolean>();

    // Ma saisie en temps réel
    var maSaisie = MutableLiveData<String>();

    // Contient la moyenne
    var moyenne = 0.0f;

    fun forceRefreshUI(){
        // Forcer à appeler l'evenement
        refreshUI.value = true;
    }

    // Tester si j'a ibien ma saisie e ntemps réel
    fun controle(){
        if (maSaisie.value!!.isEmpty()){
            println("C'est vide !")
        }
    }

    fun calculerMoyenne(){
        // notes
        val notes = mutableListOf<Float>(10.0f, 20.0f, 15.0f)

        // Il va notifier qu'il y'a un changement (il va appeler l'observer)
        moyenne = notes.average().toFloat()

        forceRefreshUI()
    }
}