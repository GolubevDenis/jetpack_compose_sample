package com.blackcube.moviessearcher.ui.screens

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.AnimationClockAmbient
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.foundation.*
import androidx.ui.foundation.animation.FlingConfig
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Scaffold
import androidx.ui.material.Surface
import androidx.ui.material.TopAppBar
import androidx.ui.res.imageResource
import androidx.ui.text.font.FontStyle
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.blackcube.moviessearcher.MoviesApplication
import com.blackcube.moviessearcher.R
import com.blackcube.moviessearcher.data.repository.MoviesRepository
import com.blackcube.moviessearcher.domain.models.Genre
import com.blackcube.moviessearcher.domain.models.Movie
import com.blackcube.moviessearcher.ui.screenBackground
import com.blackcube.moviessearcher.ui.secondaryText


@Composable
fun HomeScreen(repository: MoviesRepository) {
    Scaffold(
            topAppBar = {
                Header()
            },
            bodyContent = { modifier ->
                GenresScreenContent(repository, modifier)
            }
    )
}

private lateinit var verticalScrollPosition: ScrollerPosition

@Composable
private fun GenresScreenContent(
        repository: MoviesRepository,
        modifier: Modifier
) {
    if (!(::verticalScrollPosition.isInitialized))
        verticalScrollPosition = scrollPosition()

    val movies = repository.genres()
    Box(
            backgroundColor = screenBackground,
            modifier = modifier
    ) {
        VerticalScroller(scrollerPosition = verticalScrollPosition) {
            movies.forEach {
                MoviesHorizontalScroller(it, repository)
            }
        }
    }
}

@Composable
private fun Header() {
    TopAppBar(backgroundColor = Color.White, modifier = Modifier.height(72.dp)) {
        Text(
                text = "Бесплатное кино",
                fontSize = 22.sp,
                color = Color.Black,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.gravity(Alignment.Bottom).padding(bottom = 8.dp, start = 24.dp)
        )
        Icon(
                asset = imageResource(id = android.R.drawable.ic_menu_search),
                modifier = Modifier.gravity(Alignment.CenterVertically).padding(end = 12.dp).clickable(onClick = {
                    MoviesApplication.navigation.navigateTo { SearchScreen() }
                })
        )
    }
}

@Composable
private fun MoviesHorizontalScroller(genre: Genre, repository: MoviesRepository) {
    val movies = repository.moviesFor(genre)
    Column(modifier = Modifier.padding(bottom = 36.dp, top = 12.dp)) {
        Text(text = genre.title, fontSize = 20.sp, modifier = Modifier.padding(start = 16.dp))

        if (movies.count() == 0) {
            NoMoviesPlaceholder()
        } else {
            HorizontalScroller(scrollerPosition = scrollPosition(), modifier = Modifier.padding(top = 18.dp)) {
                Row(modifier = Modifier.padding(horizontal = 16.dp)) {
                    movies.forEach {
                        MovieCard(it)
                    }
                }
            }
        }
    }
}


@Composable
private fun NoMoviesPlaceholder() {
    Text(text = "Пока нет фильмов в этой категории...", fontSize = 12.sp, modifier = Modifier.padding(16.dp), color = secondaryText)
}

/**
 * Workaround for issue
 * https://issuetracker.google.com/issues/160042650
 * */
@Composable
fun scrollPosition(): ScrollerPosition {

    val clock = AnimationClockAmbient.current
    val config = FlingConfig()
    return ScrollerPosition(
            flingConfig = config,
            initial = 0f,
            animationClock = clock,
            isReversed = false
    )

}


@Composable
private fun MovieCard(movie: Movie) {
    Column(modifier = Modifier.padding(end = 16.dp).clickable(onClick = {
        MoviesApplication.navigation.navigateTo { MovieScreen(movie = movie) }
    })) {
        Surface(shape = RoundedCornerShape(17.dp)) {
            Image(
                    modifier = Modifier.size(175.dp, 225.dp),
                    asset = movie.imageAsset!!,
                    contentScale = ContentScale.FillHeight
            )
        }
        Text(movie.title,
                modifier = Modifier.width(175.dp).padding(top = 8.dp),
                fontSize = 15.sp,
                textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun DefaultMovieCard() {
    val movie = Movie("Title", 1999, "Description", "USA", "fakeUrl", R.drawable.white_roses, Genre.COMEDY)
    MovieCard(movie)
}
