package com.example.jetpackcomposelearning

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun CounterScreen() {
    var count by remember { mutableStateOf(0) }

    Text("$count")

    Button(onClick = {
        count++;
    }) {
        Text("increase")
    }
}