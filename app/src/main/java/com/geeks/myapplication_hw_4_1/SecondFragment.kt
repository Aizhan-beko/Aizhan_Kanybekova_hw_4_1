package com.geeks.myapplication_hw_4_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs


import com.geeks.myapplication_hw_4_1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding:FragmentSecondBinding
    private val _binding get() = binding!!
    private val args by navArgs<SecondFragment>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root

        val details = args.myModel

        binding.tvLogin.text = details.name
        binding.tvEmail.text = details.email
        binding.tvPassword.text = details.password

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding.equals(null)
    }
}