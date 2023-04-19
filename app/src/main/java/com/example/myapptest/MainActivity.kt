package com.example.myapptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Correction partie 1
        // tpMoyennePartie1()

        // Correction partie 2
        tpMoyennePartie2()
    }

    // J'appel ma fonction
    fun tpMoyennePartie1 () {
        // Déclarer des notes
        var note1 : Float = 15.0f
        var note2 : Float = 18.0f

        // Calculer la moyenne
        var moyenne = (note1+note2) / 2.0f;

        // Afficher
        println("ENI-DEMO : " + moyenne)
    }

    fun moyenneMatiere(notes : MutableList<Float>, nomMatiere : String) : Float{
        val moyenne = notes.average().toFloat();

        println("ENI-DEMO : La moyenne en " + nomMatiere + " -> " + moyenne)

        // Retourner la moyenne de la matière
        return moyenne;
    }

    fun tpMoyennePartie2(){
        // la liste de toute les moyennes (toute les matières)
        var moyennesMatieres = mutableListOf<Float>()

        // moyenne Math
        moyennesMatieres.add(moyenneMatiere(mutableListOf<Float>(10.0f, 0.5f, 18.3f), "Math"))

        // moyenne Francais
        moyennesMatieres.add(moyenneMatiere(mutableListOf<Float>(3.0f, 0.5f, 2.0f), "Français"))

        // moyenne Sport
        moyennesMatieres.add(moyenneMatiere(mutableListOf<Float>(8.0f, 0.5f, 15.0f), "Sport"))

        // moyenne génèrale
        // la somme de toute les matières / par le nombre de matière
        val moyenneGenerale = moyennesMatieres.average().toFloat()

        println("ENI-DEMO : La moyenne generale est : " + moyenneGenerale)
        // Version 2 : A la mano niveau 1
        /*
        var sum = 0.0f
        for (note in notesMath){
            sum += note
        }
        val moyenne = sum / notesMath.size
        */

        // Version 3 : A la mano niveau 2
        // val moyenne = notesMath.sum() / notesMath.size;
    }
}