package com.example.mycreativecv.ui.proprofile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mycreativecv.databinding.FragmentProprofileBinding

class ProprofileFragment : Fragment() {

    private var _binding: FragmentProprofileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProprofileBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}