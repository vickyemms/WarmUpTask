package com.example.warmuptask

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Download: Screen(route = "download_screen")

    fun withArgs(vararg args: String): String{
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}


