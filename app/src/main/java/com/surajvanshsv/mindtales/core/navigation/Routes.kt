package com.surajvanshsv.mindtales.core.navigation

sealed class Routes (val route : String) {

    object SplashScreen : Routes("splash_screen")
    object LoginScreen : Routes("login_screen")
    object HomeScreen : Routes("home_screen")
    object MeditationScreen : Routes("meditation_screen")


}