package com.example.cityguide.data

object PlacesRepository {
    private val places = listOf(
        Place(1, "Кремль", "Достопримечательности", "Исторический комплекс", "https://image.url", 4.8f),
        Place(2, "Парк Горького", "Парки", "Популярное место для отдыха", "https://image.url", 4.5f),
        Place(3, "Ресторан 'Москва'", "Рестораны", "Отличная русская кухня", "https://image.url", 4.7f)
    )

    fun getCategories(): List<String> = listOf("Достопримечательности", "Парки", "Рестораны")

    fun getPlacesByCategory(category: String): List<Place> = places.filter { it.category == category }
}