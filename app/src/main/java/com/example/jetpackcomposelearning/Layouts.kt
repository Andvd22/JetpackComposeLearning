package com.example.jetpackcomposelearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
//    Row (
//        modifier = Modifier.background(color = Color.Green).fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically
//        ) {
//        Text("Hello DOs")
//        Text("Hello lelele")
//        Button(onClick = {}) {
//            Text("Do Something")
//        }
//    }

    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(R.drawable.chillguy),
            contentDescription = null,
            modifier= Modifier.width(100.dp)
                .height(100.dp).align(Alignment.Center)
        )
        Text("Overlay text",
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center))
    }

}

@Composable
@Preview(showSystemUi = true)
fun ColumnLayoutPrev(modifier: Modifier = Modifier) {
    ColumnExample()
}