package com.example.walkthrough_topbar_ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.walkthrough_topbar_ui.ui.InfoScreen
import com.example.walkthrough_topbar_ui.ui.MainScreen
import com.example.walkthrough_topbar_ui.ui.SettingsScreen


@Composable
fun ScaffoldApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home") { MainScreen(navController) }
        composable(route = "info") { InfoScreen(navController) }
        composable(route = "settings") { SettingsScreen(navController) }
    }
}


