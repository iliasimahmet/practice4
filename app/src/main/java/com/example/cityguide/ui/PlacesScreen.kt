package com.example.cityguide.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cityguide.data.PlacesRepository

@Composable
fun PlacesScreen(category: String, navController: NavController) {
    val places = PlacesRepository.getPlacesByCategory(category)

    LazyColumn {
        items(places) { place ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { navController.navigate("details/${place.id}") }
            ) {
                Text(place.name, modifier = Modifier.padding(16.dp))
            }
        }
    }
}