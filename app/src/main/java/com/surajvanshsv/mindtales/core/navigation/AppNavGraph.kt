package com.surajvanshsv.mindtales.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.surajvanshsv.mindtales.features.home.HomeScreen
import com.surajvanshsv.mindtales.features.login.LoginScreen
import com.surajvanshsv.mindtales.features.splash.SplashScreen

@Composable
fun AppNavGraph(){
    // nav controller for navigation
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SplashScreen.route
    ){
        composable(Routes.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(Routes.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(Routes.HomeScreen.route) {
            HomeScreen()
        }
        composable(Routes.MeditationScreen.route) {
            //MeditationScreen()
        }

    }





}