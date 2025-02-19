package com.example.cityguide.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cityguide.data.PlacesRepository

@Composable
fun DetailsScreen(placeId: Int) {
    val place = PlacesRepository.getPlacesByCategory("").find { it.id == placeId }

    place?.let {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = it.name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = it.description, modifier = Modifier.padding(top = 8.dp))
            Text(text = "Рейтинг: ${it.rating}", modifier = Modifier.padding(top = 8.dp))
        }
    }
}
