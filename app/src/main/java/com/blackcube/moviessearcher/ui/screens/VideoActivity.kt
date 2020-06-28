package com.blackcube.moviessearcher.ui.screens

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.blackcube.moviessearcher.R
import com.blackcube.moviessearcher.domain.models.Movie

class VideoActivity : AppCompatActivity() {

    companion object {

        private const val MOVIE_ARG = "com.blackcube.moviessearcher.movie"
        fun show(context: Context, movie: Movie){
            val intent = Intent(context, VideoActivity::class.java)
            intent.putExtra(MOVIE_ARG, movie.url)
            context.startActivity(intent)
        }
    }


    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        supportActionBar?.hide()

        val videoView = findViewById<VideoView>(R.id.video_view)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val uri: Uri = Uri.parse(intent.getStringExtra(MOVIE_ARG))
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }

}