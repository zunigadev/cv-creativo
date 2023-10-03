package com.example.mycreativecv.ui.workexperience

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mycreativecv.databinding.FragmentWExperienceBinding

class WExperienceFragment : Fragment() {

    private var _binding: FragmentWExperienceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWExperienceBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}