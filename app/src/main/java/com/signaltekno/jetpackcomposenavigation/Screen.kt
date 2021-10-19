package com.signaltekno.jetpackcomposenavigation

const val DEFAULT_ARG_KEY = "id"
const val DEFAULT_ARG2_KEY = "name"


sealed class Screen(val route: String){
    object Home: Screen(route = "HOME_SCREEN")
    object Detail: Screen(route = "DETAIL_SCREEN/{$DEFAULT_ARG_KEY}/{$DEFAULT_ARG2_KEY}"){
        fun passId(id: Int, name: String): String{
            return "DETAIL_SCREEN/${id}/${name}"
        }
    }
}
