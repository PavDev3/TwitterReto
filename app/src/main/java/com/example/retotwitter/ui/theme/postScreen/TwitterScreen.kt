package com.example.retotwitter.ui.theme.postScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.retotwitter.R


@Composable
fun TwitterPost() {
    Row(
        modifier = Modifier
            .background(color = Color(0xFF1B2936))
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        UserIcon()
        Row {
            ContentBox()
        }
    }
}


@Composable
fun ContentBox() {
    Column(
        Modifier
            .padding(8.dp), horizontalAlignment = Alignment.Start
    ) {
        UserInfo()
        BodyText()
        BarButtons()

    }
}

@Composable
fun UserIcon() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "Profile Avatar",
        modifier = Modifier
            .size(60.dp)
            .clip(CircleShape)
    )
}

@Composable
fun PostDivider() {
    Divider(
        Modifier
            .padding(top = 4.dp)
            .height(1.dp)
            .fillMaxWidth(),
        color = Color(0xFF7E8B98)
    )
}







