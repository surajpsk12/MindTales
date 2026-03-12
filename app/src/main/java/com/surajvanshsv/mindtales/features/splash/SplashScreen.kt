package com.surajvanshsv.mindtales.features.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.surajvanshsv.mindtales.core.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
){

    // automatic run for the first time for 2 seconds then navigate to login screen
    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate(Routes.LoginScreen.route){
            popUpTo(Routes.SplashScreen.route){
                inclusive = true
            }
        }
    }



    Box(
        modifier= Modifier.fillMaxSize().padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Splash Screen",
            textAlign = TextAlign.Center
        )
    }
}