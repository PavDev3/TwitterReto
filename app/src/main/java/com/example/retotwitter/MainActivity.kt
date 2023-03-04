package com.example.retotwitter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.retotwitter.ui.theme.RetoTwitterTheme
import com.example.retotwitter.ui.theme.postScreen.PostDivider
import com.example.retotwitter.ui.theme.postScreen.TwitterPost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RetoTwitterTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF1B2936))
                ) {
                    TwitterPost()
                    PostDivider()
                }
            }
        }
    }
}

