package com.example.challanges6

import android.view.Window
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsAnimationControllerCompat
import androidx.core.view.WindowInsetsControllerCompat

fun setFullScreen (window: Window){
    WindowCompat.setDecorFitsSystemWindows(window, false)
}

fun lightStatusBar(window: Window, isLight: Boolean = true){
    val wic = WindowInsetsControllerCompat (window, window.decorView)
    wic.isAppearanceLightNavigationBars = isLight
}