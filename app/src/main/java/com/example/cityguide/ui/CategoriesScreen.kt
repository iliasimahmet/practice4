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
fun CategoriesScreen(navController: NavController) {
    val categories = PlacesRepository.getCategories()

    LazyColumn {
        items(categories) { category ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { navController.navigate("places/$category") }
            ) {
                Text(text = category, modifier = Modifier.padding(16.dp))
            }
        }
    }
}


