package com.hsc.apphelp.ui.listHelp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.ktx.Firebase
import com.hsc.apphelp.R
import com.hsc.apphelp.databinding.FragmentHomeBinding
import com.hsc.apphelp.ui.home.HomeViewModel
import androidx.fragment.app.Fragment as Fragment



class ListHelpFragment: Fragment() {


    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

