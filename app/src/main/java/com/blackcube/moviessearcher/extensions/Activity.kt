package com.blackcube.moviessearcher.extensions

import android.app.Activity
import android.content.Context
import android.graphics.Point
import android.view.Display

fun Activity.getScreenSize(): Pair<Int, Int> {
    val display: Display = windowManager.defaultDisplay
    val size = Point()
    display.getSize(size)
    val width: Int = size.x
    val height: Int = size.y
    return width to height
}