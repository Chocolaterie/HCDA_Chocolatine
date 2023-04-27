package com.example.myapptest.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapptest.R
import com.example.myapptest.databinding.ActivityDemoRecyclerViewBinding

class DemoRecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityDemoRecyclerViewBinding>(this, R.layout.activity_demo_recycler_view)

        // Instancier mon Adapter
        val articleListAdapter = ArticleListAdapter()

        // J'associe mon adapter au recycler view
        binding.rvArticles.adapter = articleListAdapter

        // Créer des données bouchon (fausses données, données poyr tester)
        val articles = mutableListOf<Article>()

        // generer 20 articles
        for (i in 0..20){
            val articleTitle = String.format("Mon article %d", i)
            articles.add(Article(i, articleTitle))
        }
        // --

        // Envoie les 20 articles dans le RecyclerView
        articleListAdapter.submitList(articles)
    }
}