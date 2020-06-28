package com.blackcube.moviessearcher

import android.content.res.Resources
import com.blackcube.moviessearcher.data.repository.MoviesRepository
import com.blackcube.moviessearcher.data.repository.MoviesStabRepository

interface AppComponent {

    val moviesRepository: MoviesRepository

}

class AppComponentImpl(
    private val resources: Resources
) : AppComponent {

    override val moviesRepository: MoviesRepository = MoviesStabRepository(resources)

}