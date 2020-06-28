package com.blackcube.moviessearcher.navigation

import android.content.Context
import com.blackcube.moviessearcher.domain.models.Movie
import com.blackcube.moviessearcher.ui.screens.VideoActivity

class VideoNavigation(
    rootNavigation: Navigation,
    private val context: Context
) : Navigation by rootNavigation {

    fun navigateToVideo(movie: Movie){
       VideoActivity.show(context, movie)
    }

}