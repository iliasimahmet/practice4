package com.example.cityguide.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "categories") {
        composable("categories") { CategoriesScreen(navController) }
        composable("places/{category}") { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            PlacesScreen(category, navController)
        }
        composable("details/{placeId}") { backStackEntry ->
            val placeId = backStackEntry.arguments?.getString("placeId")?.toInt() ?: 0
            DetailsScreen(placeId)
        }
    }
}