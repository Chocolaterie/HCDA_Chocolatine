package com.example.myapptest.demorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapptest.databinding.ArticleLineBinding

class ArticleListAdapter : ListAdapter<Article, ArticleListAdapter.ViewHolder>(ArticleDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Récupérer le context
        val layoutInflater = LayoutInflater.from(parent.context)

        // Récupérer et charger la cellule dans le RecyclerView
        val binding = ArticleLineBinding.inflate(layoutInflater, parent, false)

        // Instancier le view holder interne
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Récupèrer une données dans la liste d'article
        val articleData = getItem(position)

        // Associer la donnée à la cellule/ligne
        holder.binding.article = articleData

        // rafraichir la cellule/ligne
        holder.binding.executePendingBindings()
    }

    // Classe Interne pour associer une ligne/cellule à l'adapter
    class ViewHolder(val binding : ArticleLineBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}