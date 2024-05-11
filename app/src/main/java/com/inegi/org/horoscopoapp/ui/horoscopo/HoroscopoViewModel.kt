package com.inegi.org.horoscopoapp.ui.horoscopo

import androidx.lifecycle.ViewModel
import com.inegi.org.horoscopoapp.domain.model.HoroscopoInfo
import com.inegi.org.horoscopoapp.domain.model.HoroscopoInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopoViewModel @Inject constructor():ViewModel() {

    private var _horoscopo = MutableStateFlow<List<HoroscopoInfo>>(emptyList())
    val horoscopo: StateFlow<List<HoroscopoInfo>> = _horoscopo  // LiveData<List<HoroscopoInfo>> = _horoscopo

    init {
        _horoscopo.value = listOf(
            Aries , Taurus, Gemini)

    }



}