package com.inegi.org.horoscopoapp.ui.horoscopo.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.inegi.org.horoscopoapp.databinding.ItemHoroscopoBinding
import com.inegi.org.horoscopoapp.domain.model.HoroscopoInfo

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopoBinding.bind(view)

    fun render(horoscopoInfo: HoroscopoInfo){
        val context : Context = binding.tvTitle.context

        binding.ivHoroscopo.setImageResource(horoscopoInfo.img)
        binding.tvTitle.text = binding.tvTitle.context.getString(horoscopoInfo.name)


    }
}