package com.signaltekno.jetpackcomposenavigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavigation(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.Home.route){
        composable(route = Screen.Home.route){
            Home(navController = navController)
        }
        composable(route = Screen.Detail.route, arguments = listOf(
            navArgument(name = DEFAULT_ARG_KEY){
                type = NavType.IntType
            },
            navArgument(name = DEFAULT_ARG2_KEY){
                type = NavType.StringType
            }
        )){
            Log.d("Argument", it.arguments?.getInt(DEFAULT_ARG_KEY).toString())
            Log.d("Argument", it.arguments?.getString(DEFAULT_ARG2_KEY).toString())
            Detail(navController = navController)
        }
    }
}