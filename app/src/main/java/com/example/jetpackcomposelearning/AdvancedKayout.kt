package com.example.jetpackcomposelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample(modifier: Modifier = Modifier) {
//    LazyColumn(
//        modifier = Modifier
//            .background(Color.White)
//            .padding(8.dp)
//            .fillMaxSize()
//    ) {
//        items(count = 100){index ->
//
//            Text(
//                "Item $index",
//                modifier= Modifier.padding(8.dp)
//            )
//
//        }
//    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Submit")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Prev(modifier: Modifier = Modifier) {
    LazyColumnExample()
}