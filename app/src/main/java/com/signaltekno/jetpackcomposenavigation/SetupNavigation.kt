package com.signaltekno.jetpackcomposenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.Home.route){
        composable(route = Screen.Home.route){
            Home(navController = navController)
        }
        composable(route = Screen.Detail.route){
            Detail(navController = navController)
        }
    }
}