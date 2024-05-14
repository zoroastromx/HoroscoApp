package com.inegi.org.horoscopoapp.ui.horoscopo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.inegi.org.horoscopoapp.databinding.FragmentHoroscopoBinding
import com.inegi.org.horoscopoapp.ui.horoscopo.adapter.HoroscopoAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HoroscopoFragment : Fragment() {

    private val horoscopoViewModel by viewModels<HoroscopoViewModel>()

    private lateinit var horoscopoadapter: HoroscopoAdapter

    private var _binding: FragmentHoroscopoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        initList()
        initUIState()
    }

    private fun initList() {
        horoscopoadapter = HoroscopoAdapter()
        binding.rvHoroscopo.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = horoscopoadapter
        }
        //binding.rvHoroscopo.layoutManager = LinearLayoutManager(context)
        //binding.rvHoroscopo.adapter = horoscopoadapter
    }

    private fun initUIState() {
        // una corrutina para observar el estado
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                horoscopoViewModel.horoscopo.collect{
                    // cambios en horoscopos
                    horoscopoadapter.updateList(it)
                }
            }

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopoBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_horoscopo, container, false)
        return binding.root
    }

}