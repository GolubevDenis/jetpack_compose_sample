package com.blackcube.moviessearcher.ui.screens

import androidx.compose.Ambient
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.clickable
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.blackcube.moviessearcher.MoviesApplication
import com.blackcube.moviessearcher.domain.models.Movie
import com.blackcube.moviessearcher.navigation.Navigation
import com.blackcube.moviessearcher.ui.secondaryText

@Composable
fun MovieScreen(movie: Movie) {
    VerticalScroller {
        Column {
            Stack(modifier = Modifier.clickable(onClick = {
                MoviesApplication.navigation.navigateToVideo(movie)
            })) {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    asset = movie.imageAsset!!,
                    contentScale = ContentScale.Crop
                )
                Image(asset = imageFromResource(ContextAmbient.current.resources, android.R.drawable.ic_media_play), modifier = Modifier.gravity(
                    Alignment.Center))
            }
            Text(
                text = movie.title,
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 16.dp).gravity(Alignment.CenterHorizontally)
            )
            Text(
                text = "${movie.age} | ${movie.genre.title} | ${movie.country}",
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 40.dp).gravity(Alignment.CenterHorizontally),
                color = secondaryText
            )
            Text(
                text = "Описание",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 23.dp, start = 36.dp)
            )
            Text(
                text = movie.description,
                fontSize = 14.sp,
                modifier = Modifier.padding(vertical = 18.dp, horizontal = 36.dp)
            )
        }
    }
}