package com.inegi.org.horoscopoapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.inegi.org.horoscopoapp.R
import com.inegi.org.horoscopoapp.databinding.FragmentHoroscopoBinding
import com.inegi.org.horoscopoapp.databinding.FragmentLuckBinding

class LuckFragment : Fragment() {

private var _binding: FragmentLuckBinding? = null
private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_luck, container, false)
        return binding.root
    }

}