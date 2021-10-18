package com.signaltekno.jetpackcomposenavigation

sealed class Screen(val route: String){
    object Home: Screen(route = "HOME_SCREEN")
    object Detail: Screen(route = "DETAIL_SCREEN")
}
