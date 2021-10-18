package com.signaltekno.jetpackcomposenavigation

const val DEFAULT_ARG_KEY = "id"

sealed class Screen(val route: String){
    object Home: Screen(route = "HOME_SCREEN")
    object Detail: Screen(route = "DETAIL_SCREEN/{$DEFAULT_ARG_KEY}"){
        fun passId(id: Int): String{
            return "DETAIL_SCREEN/${id}"
        }
    }
}
