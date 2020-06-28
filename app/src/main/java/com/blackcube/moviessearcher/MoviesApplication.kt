package com.blackcube.moviessearcher

import android.app.Application
import androidx.compose.Composable
import com.blackcube.moviessearcher.navigation.Navigation
import com.blackcube.moviessearcher.navigation.NavigationImpl
import com.blackcube.moviessearcher.navigation.VideoNavigation
import com.blackcube.moviessearcher.ui.screens.SplashScreen

class MoviesApplication : Application() {


    companion object {
        lateinit var appComponent: AppComponent
        lateinit var navigation: VideoNavigation
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = AppComponentImpl(resources)
        navigation = VideoNavigation(
                NavigationImpl(
                        initialScreen = { SplashScreen() },
                        isSplashScreen = true
                ),
                context = this
        )
    }

}