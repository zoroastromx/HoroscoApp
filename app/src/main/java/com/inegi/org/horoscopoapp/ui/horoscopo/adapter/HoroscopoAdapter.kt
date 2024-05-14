package com.inegi.org.horoscopoapp.ui.horoscopo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inegi.org.horoscopoapp.R
import com.inegi.org.horoscopoapp.domain.model.HoroscopoInfo

class HoroscopoAdapter(private var horoscopoList: List<HoroscopoInfo> = emptyList()):
    RecyclerView.Adapter<HoroscopeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_horoscopo, parent, false))
    }

    override fun getItemCount() = horoscopoList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}