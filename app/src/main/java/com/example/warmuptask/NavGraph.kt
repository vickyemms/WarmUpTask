package com.example.warmuptask

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    context: Context
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ){
            HomeScreen()
        }
        composable(
            route = Screen.Download.route + "/{appType}/{packageName}",
            arguments = listOf(
                navArgument("appType") {
                    type = NavType.StringType
                },
                navArgument("packageName") {
                    type = NavType.StringType
                }
            )
        ){ entry ->
            DownloadScreen(context, appType = entry.arguments?.getString("appType"), packageName = entry.arguments?.getString("packageName"))
        }
    }
}