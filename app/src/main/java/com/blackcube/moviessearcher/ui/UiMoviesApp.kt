package com.blackcube.moviessearcher.ui

import androidx.compose.Composable
import androidx.ui.animation.Crossfade
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import com.blackcube.moviessearcher.AppComponent
import com.blackcube.moviessearcher.MoviesApplication

@Composable
fun UIMoviesApp() {
    appTheme {
        appContent()
    }
}

@Composable
fun appContent(){
    Crossfade(
        current = MoviesApplication.navigation.currentScreen
    ) { screen ->
        Surface(color = MaterialTheme.colors.background) {
            screen.value()
        }
    }
}

@Composable
fun appTheme(content: @Composable() () -> Unit ){
    MaterialTheme() {
        content()
    }
}