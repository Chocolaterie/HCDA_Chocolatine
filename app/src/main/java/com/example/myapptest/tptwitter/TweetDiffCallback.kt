package com.example.myapptest.tptwitter

import androidx.recyclerview.widget.DiffUtil

class TweetDiffCallback : DiffUtil.ItemCallback<Tweet>() {

    override fun areItemsTheSame(oldItem: Tweet, newItem: Tweet): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Tweet, newItem: Tweet): Boolean {
        return oldItem.equals(newItem)
    }
}