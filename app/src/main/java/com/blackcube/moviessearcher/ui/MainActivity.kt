package com.blackcube.moviessearcher.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import com.blackcube.moviessearcher.MoviesApplication
import com.blackcube.moviessearcher.ui.screens.HomeScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UIMoviesApp()
        }

        MoviesApplication.navigation.navigateTo {
            HomeScreen(MoviesApplication.appComponent.moviesRepository)
        }

    }

    override fun onBackPressed() {
        if(!MoviesApplication.navigation.navigateBack()){
            super.onBackPressed()
        }
    }

}
