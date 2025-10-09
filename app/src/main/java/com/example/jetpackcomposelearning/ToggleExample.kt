package com.example.jetpackcomposelearning

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource

@Composable
fun ToggleExample(modifier: Modifier = Modifier) {
    var isChecked by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isChecked,
            onCheckedChange = {isChecked = it},
            //onCheckedChange = { checkedValue -> isChecked = checkedValue }

        )

        Text(if (isChecked) "Checked" else "UnChecked", color = colorResource(R.color.purple_200))
    }
}


//@Preview(showBackground = true)
//@Composable
//fun ToggleExamplePreview() {
//    ToggleExample()
//}
