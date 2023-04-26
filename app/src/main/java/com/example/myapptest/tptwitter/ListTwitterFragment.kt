package com.example.myapptest.tptwitter

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapptest.R

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

        // Afficher une popup
        val builder = AlertDialog.Builder(context)

        with(builder)
        {
            setTitle("Information")
            setMessage("You are logged")
            show()
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_twitter, container, false)
    }
}