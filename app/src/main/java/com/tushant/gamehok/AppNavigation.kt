package com.tushant.gamehok

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tushant.gamehok.screens.GameDetailsScreen
import com.tushant.gamehok.screens.Homepage
import com.tushant.gamehok.screens.TournamentDetailsScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "homepage") {
        composable("homepage") { Homepage(navController = navController) }
        composable("tournament_details") { TournamentDetailsScreen(navController = navController) }
        composable("game_details") { GameDetailsScreen(navController = navController) }
    }
}