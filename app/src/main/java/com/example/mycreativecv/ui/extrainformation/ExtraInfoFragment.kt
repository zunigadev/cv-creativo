package com.example.mycreativecv.ui.extrainformation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mycreativecv.databinding.FragmentExtraInfoBinding

class ExtraInfoFragment : Fragment() {

    private var _binding: FragmentExtraInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentExtraInfoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}