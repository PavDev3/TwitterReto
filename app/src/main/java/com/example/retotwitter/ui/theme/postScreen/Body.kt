package com.example.retotwitter.ui.theme.postScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.retotwitter.R

@Composable
fun BodyText() {
    Column() {
        Text(text = stringResource(R.string.textMessage), color = Color.White)
    }
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "Imagen del content",
        Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(10)),
        contentScale = ContentScale.Crop
    )
}


