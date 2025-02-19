package com.example.cityguide.data

data class Place(
    val id: Int,
    val name: String,
    val category: String, // "Достопримечательности", "Рестораны"
    val description: String,
    val imageUrl: String? = null,
    val rating: Float = 0f
)