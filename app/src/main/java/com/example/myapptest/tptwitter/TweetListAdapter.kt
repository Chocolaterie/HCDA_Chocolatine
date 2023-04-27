package com.example.myapptest.tptwitter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptest.databinding.TweetLineBinding

class TweetListAdapter : ListAdapter<Tweet, TweetListAdapter.ViewHolder>(TweetDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Récupérer le context
        val layoutInflater = LayoutInflater.from(parent.context)

        // Récupérer et charger la cellule dans le RecyclerView
        val binding = TweetLineBinding.inflate(layoutInflater, parent, false)

        // Instancier le view holder interne
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Récupèrer une données dans la liste d'article
        val tweetData = getItem(position)

        // Associer la donnée à la cellule/ligne
        holder.binding.tweet = tweetData

        // rafraichir la cellule/ligne
        holder.binding.executePendingBindings()
    }

    // Classe Interne pour associer une ligne/cellule à l'adapter
    class ViewHolder(val binding : TweetLineBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}