package com.example.myapptest.demonavfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.myapptest.R
import com.example.myapptest.databinding.FragmentOneBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {

    private lateinit var binding : FragmentOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Vue du fragment en version data binding dans une variable
        binding = DataBindingUtil.inflate<FragmentOneBinding>(inflater, R.layout.fragment_one, container, false)

        // Que faire lors du clique du bouton
        binding.btnOpenFragmentTwo.setOnClickListener {
            // Change de fragment graçe au singleton NavController et en appelant l'action et
            // non directement le fragment cible
            findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        // Obligatoire retourner le root de la vue version DataBinding sinon page blanche
        return binding.root
    }
}