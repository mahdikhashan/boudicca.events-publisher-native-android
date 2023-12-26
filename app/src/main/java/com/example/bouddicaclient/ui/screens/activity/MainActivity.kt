package com.example.bouddicaclient.ui.screens.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.isSystemInDarkTheme

import com.example.bouddicaclient.ui.screens.mainscreen.MainScreen
import com.example.bouddicaclient.ui.theme.HiltMVVMComposeMovieTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      HiltMVVMComposeMovieTheme {
        MainScreen()
      }
    }
  }
}