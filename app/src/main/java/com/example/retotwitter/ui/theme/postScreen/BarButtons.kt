package com.example.retotwitter.ui.theme.postScreen


import androidx.compose.foundation.Image

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.retotwitter.R

@Composable
fun BarButtons() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
            ,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Comment()
        Retweet()
        Likes()
    }
}

@Composable
fun Likes() {
    val likeIcon = painterResource(id = R.drawable.ic_like)
    val likeIconFill = painterResource(id = R.drawable.ic_like_filled)


    var painter by remember { mutableStateOf(likeIcon) }
    var isFilled by remember { mutableStateOf(false) }
    var likeCounter by remember { mutableStateOf(7) }
    Row {
        Image(
            painter = painter,
            contentDescription = "Like Icon",
            modifier = Modifier.clickable(onClick = {
                // Cambiar la imagen y el relleno al hacer clic
                painter = if (isFilled) likeIcon else likeIconFill
                isFilled = !isFilled
                likeCounter += if (isFilled) 1 else -1
            }),
            // Tintar la imagen de rojo cuando esté rellena
            colorFilter = if (isFilled) ColorFilter.tint(Color(0xFF7E8B98)) else null
        )
        Text(
            text = likeCounter.toString(), color = Color(0xFF7E8B98),
            modifier = Modifier.padding(start = 4.dp)
        )
    }

}

@Composable
fun Retweet() {
    var rtFilled by remember { mutableStateOf(false) }
    var rtCounter by remember { mutableStateOf(3) }

    Row() {
        Image(
            painter = painterResource(id = R.drawable.ic_rt), contentDescription = "Retweet",
            modifier = Modifier.clickable(onClick = {
                rtFilled = !rtFilled
                rtCounter += if (rtFilled) 1 else -1
            }), colorFilter = if (rtFilled) ColorFilter.tint(Color.Green) else null
        )
        Text(
            text = rtCounter.toString(),color = Color(0xFF7E8B98),
            modifier = Modifier.padding(start = 4.dp)
        )
    }
}

@Composable
fun Comment() {
    val comentIcon = painterResource(id = R.drawable.ic_chat)
    val comentIconFilled = painterResource(id = R.drawable.ic_chat_filled)


    var painter by remember { mutableStateOf(comentIcon) }
    var isFilled by remember { mutableStateOf(false) }
    var comentCounter by remember { mutableStateOf(23) }
    Row {
        Image(
            painter = painter,
            contentDescription = "Coment Icon",
            modifier = Modifier.clickable(onClick = {
                // Cambiar la imagen y el relleno al hacer clic
                painter = if (isFilled) comentIcon else comentIconFilled
                isFilled = !isFilled
                comentCounter += if (isFilled) 1 else -1
            }),
            // Tintar la imagen de rojo cuando esté rellena
            colorFilter = if (isFilled) ColorFilter.tint(Color.DarkGray) else null
        )
        Text(
            text = comentCounter.toString(),color = Color(0xFF7E8B98),
            modifier = Modifier.padding(start = 4.dp)
        )
    }

}