package com.example.tmanager.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tmanager.R
import com.example.tmanager.databinding.FragmentNotificationsBinding
import com.example.tmanager.databinding.FragmentProfileBinding
import com.example.tmanager.databinding.FragmentTaskBinding

class ProfileFragment: Fragment(){

private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}