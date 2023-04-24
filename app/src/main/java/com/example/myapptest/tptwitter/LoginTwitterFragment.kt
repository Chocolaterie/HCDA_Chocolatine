package com.example.myapptest.tptwitter

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.myapptest.R
import com.example.myapptest.databinding.FragmentLoginTwitterBinding
import com.example.myapptest.databinding.FragmentOneBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LoginTwitterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginTwitterFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Vue du fragment en version data binding dans une variable
        val binding = DataBindingUtil.inflate<FragmentLoginTwitterBinding>(inflater, R.layout.fragment_login_twitter, container, false)

        // Que faire lors du clique du bouton
        binding.btnLogin.setOnClickListener {
            // Si au moins un champs est vide
            if (binding.edtEmail.text.isEmpty() || binding.edtPaswword.text.isEmpty()){
                //j'affiche un message
                binding.tvFormMessage.text = "Veuillez saisir tous les champs"
                binding.tvFormMessage.setTextColor(Color.parseColor("#FF0000"))
            }
            else {
                // j'affiche un message
                binding.tvFormMessage.text = "Saisies correctes"
                // naviguer de login fragment à list fragment
                findNavController().navigate(R.id.action_loginTwitterFragment_to_listTwitterFragment)
            }
        }

        // Obligatoire retourner le root de la vue version DataBinding sinon page blanche
        return binding.root
    }
}