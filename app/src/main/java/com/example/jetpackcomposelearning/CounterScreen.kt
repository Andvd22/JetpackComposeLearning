package com.example.jetpackcomposelearning

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen() {
    var count by remember { mutableStateOf(0) }

    Column {
        Text("$count",
            modifier = Modifier.padding(16.dp),
            color = colorResource(R.color.teal_200)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            count++;
        }) {
            Text("increase")
        }
    }

}