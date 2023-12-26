package com.example.bouddicaclient.ui.screens.homescreen

import com.example.bouddicaclient.ui.screens.homescreen.HomeViewModel

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.bouddicaclient.ui.components.EventList

import timber.log.Timber

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
  navController: NavController
) {
  val bookmarkViewModel = hiltViewModel<HomeViewModel>()
  val events by bookmarkViewModel.events.observeAsState()

  val TAG = "home screen"

  LaunchedEffect(key1 = true) {
    Timber.tag(TAG).d("This is a debug message")
    bookmarkViewModel.loadEvents()
  }

  Surface (
    contentColor = Color.White,
  ) {
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .background(
          color = Color.White
        ),
    ) {
      EventList(events = events ?: emptyList())
    }
  }
}