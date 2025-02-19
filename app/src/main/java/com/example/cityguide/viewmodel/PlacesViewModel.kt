package com.example.cityguide.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.cityguide.data.Place
import com.example.cityguide.data.PlacesRepository

class PlacesViewModel : ViewModel() {
    private val _places = mutableStateOf<List<Place>>(emptyList())
    val places: State<List<Place>> = _places

    fun loadPlaces(category: String) {
        _places.value = PlacesRepository.getPlacesByCategory(category)
    }
}