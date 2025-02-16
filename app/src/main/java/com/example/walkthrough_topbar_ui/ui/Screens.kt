package com.example.walkthrough_topbar_ui.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.walkthrough_topbar_ui.ui.MainTopAppBar
import com.example.walkthrough_topbar_ui.ui.ScreenTopBar

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = { MainTopAppBar("My app",navController) },
    ) { innerPadding ->
        Text(text="Home Screen",modifier = Modifier.padding(innerPadding))
    }
}
@Composable
fun InfoScreen(navController: NavController) { Scaffold(
    topBar = { ScreenTopBar("Info",navController) },
) { innerPadding ->
    Text(text="Info Screen",modifier = Modifier.padding(innerPadding))
}
}
@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Settings",navController) },
    ) { innerPadding ->
        Text(text="Settings Screen",modifier = Modifier.padding(innerPadding))
    }
}
