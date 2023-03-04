package com.example.retotwitter.ui.theme.postScreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.retotwitter.R


@Composable
fun UserInfo() {
    Row(
        Modifier
            .fillMaxWidth()
    ) {
        Username(Modifier.padding(end = 8.dp))
        UserTag(Modifier.padding(end = 8.dp))
        LastTime(Modifier.padding(end = 8.dp))
        Spacer(modifier = Modifier.weight(1f))
        Dots()
    }
}



@Composable
fun Dots() {
    Icon(painter = painterResource(id = R.drawable.ic_dots), contentDescription = "Dots points", tint = Color.White)
}

@Composable
fun LastTime(modifier: Modifier) {
    val lastTime = "34min"
    Text(text = lastTime, color = Color.Gray, modifier = modifier)
}


@Composable
fun UserTag(modifier: Modifier) {
    val userTagName = "@Usuario"
    Text(text = userTagName, color = Color.Gray, modifier = modifier)
}

@Composable
fun Username(modifier: Modifier) {
    val userName = "Usuario"
    Text(text = userName, color = Color.White, fontWeight = FontWeight.ExtraBold, modifier = modifier)
}


