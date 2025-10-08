package com.example.jetpackcomposelearning

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun ToggleExample(modifier: Modifier = Modifier) {
    var isChecked by remember { mutableStateOf(false) }

    Row {
        Checkbox(
            checked = isChecked,
            onCheckedChange = {isChecked = it}
        )

        Text(if (isChecked) "Checked" else "UnChecked")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ToggleExamplePreview() {
//    ToggleExample()
//}
