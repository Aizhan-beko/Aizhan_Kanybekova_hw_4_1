package com.geeks.myapplication_hw_4_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.geeks.myapplication_hw_4_1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {


    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }

    private fun setupListener() {
        binding.nextBtn.setOnClickListener {
            val login = binding.edLogin.text.toString()
            val email = binding.edEmail.text.toString()
            val password = binding.edPassword.text.toString()

            val myModel = MyModel(login,email, password)
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(myModel)

            findNavController().navigate(action)
        }
        }
}

private fun Any.actionFirstFragmentToSecondFragment(myModel: MyModel): NavDirections {
    TODO("Not yet implemented")
}
