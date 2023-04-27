package com.example.myapptest.tptwitter

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapptest.R
import com.example.myapptest.databinding.FragmentListTwitterBinding
import com.example.myapptest.demorecyclerview.Article
import com.example.myapptest.demorecyclerview.ArticleListAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [ListTwitterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListTwitterFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentListTwitterBinding>(inflater, R.layout.fragment_list_twitter, container, false)

        // Instancier mon Adapter
        val tweetListAdapter = TweetListAdapter()

        // J'associe mon adapter au recycler view
        binding.rvTweets.adapter = tweetListAdapter

        // Créer des données bouchon (fausses données, données poyr tester)
        val tweets = mutableListOf<Tweet>()

        // generer 20 articles
        for (i in 0..20){
            tweets.add(Tweet(i, "sidney@black-master.com", "Un message test à ne pas verifier sur google"))
        }
        // --

        // Envoie les 20 articles dans le RecyclerView
        tweetListAdapter.submitList(tweets)

        return binding.root
    }
}