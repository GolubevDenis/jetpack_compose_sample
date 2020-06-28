package com.blackcube.moviessearcher.ui.screens

import android.R
import androidx.compose.Composable
import androidx.compose.mutableStateOf
import androidx.compose.state
import androidx.ui.core.*
import androidx.ui.foundation.*
import androidx.ui.graphics.Color
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.text.TextRange
import androidx.ui.text.font.FontStyle
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.blackcube.moviessearcher.MoviesApplication
import com.blackcube.moviessearcher.domain.models.Movie
import com.blackcube.moviessearcher.ui.screenBackground

private val searchQuery = mutableStateOf("")

@Composable
fun SearchScreen(){
    Box(backgroundColor = screenBackground){
        Content()
    }
}

@Preview
@Composable
private fun Header(){
    Box(modifier = Modifier.drawShadow(4.dp), backgroundColor = Color(0xFF001E6D)) {
        Text(
            text = "Поиск",
            fontSize = 22.sp,
            color = Color.White,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 28.dp, start = 45.dp)
        )
        Spacer(modifier = Modifier.height(19.dp))
        SearchField()
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview
@Composable
private fun SearchField() {
    Card(modifier = Modifier.height(47.dp).padding(horizontal = 36.dp)) {
        Stack(modifier = Modifier.padding(horizontal = 12.dp)) {
            TextField(value = TextFieldValue(searchQuery.value, selection = TextRange(searchQuery.value.length, searchQuery.value.length)), onValueChange = {
                searchQuery.value = it.text
            }, modifier = Modifier.gravity(Alignment.Center))
            Image(asset = imageFromResource(ContextAmbient.current.resources, R.drawable.ic_menu_search), modifier = Modifier.gravity(
                Alignment.CenterEnd).padding(end = 16.dp))
        }
    }
}


@Preview
@Composable
private fun Content(){
    val movies = MoviesApplication.appComponent.moviesRepository.allMovies()
        .filter { it.title.contains(searchQuery.value) }
    Column(modifier = Modifier.fillMaxHeight()) {
        Header()
        MoviesList(movies)
    }
}

@Composable
private fun MoviesList(movies: List<Movie>) {
    AdapterList(data = movies) {
        Spacer(modifier = Modifier.height(8.dp))
        MovieCard(it)
    }
}

@Composable
private fun MovieCard(movie: Movie) {
    Card(modifier = Modifier.padding(16.dp)) {
        Column(modifier = Modifier.clickable(onClick = {
            MoviesApplication.navigation.navigateTo { MovieScreen(movie = movie) }
        })) {
            Image(
                modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                asset = movie.imageAsset!!,
                contentScale = ContentScale.Crop
            )
            Text(movie.title,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
            Text(movie.description.substring(0..80) + "...",
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
                fontSize = 13.sp,
                textAlign = TextAlign.Start
            )
        }
    }
}