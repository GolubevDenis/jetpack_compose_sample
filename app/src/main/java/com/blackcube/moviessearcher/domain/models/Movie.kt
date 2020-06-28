package com.blackcube.moviessearcher.domain.models

import androidx.annotation.DrawableRes
import androidx.ui.graphics.ImageAsset
import java.io.Serializable

data class Movie(
        val title: String,
        val age: Short,
        val description: String,
        val country: String,
        val url: String,
        @DrawableRes val preview: Int,
        val genre: Genre,
        var imageAsset: ImageAsset? = null
)