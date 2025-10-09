package com.example.jetpackcomposelearning.screens

import android.R.attr.data
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.R

data class ComboItem(
    val name: String,
    val price: String,
    val imageRes: Int
)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
    ){

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null,
                tint = Color(0xFF27214D),
                modifier = modifier.size(24.dp)
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.shopping_basket),
                    contentDescription = null,
                    modifier = modifier.size(24.dp)
                )

                Spacer(modifier = modifier.height(16.dp))

                Text(
                    "My Basket",
                    fontSize = 12.sp,
                    color = Color(0xFF272140)
                    )
            }
        }

        //Greeting text
        Text(
            text = "Hello Tony, What fruit salad combo do you want today?",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF272140),
            lineHeight = 28.sp,
            modifier = modifier.padding(bottom = 24.dp)
        )

        //SearchBar
        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    color = Color(0xFFF3F1F1),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = Color(0xFF86869E),
                modifier = modifier.size(24.dp)
            )

            Spacer(modifier = modifier.width(12.dp))

            Text(
                "Search for fruit salad combos",
                fontSize = 14.sp,
                color = Color(0xFF86869E)
                )

            Spacer(modifier = modifier.weight(1f))

            Image(
                painter = painterResource(R.drawable.filter_list),
                contentDescription = null,
                modifier = modifier.size(20.dp)
            )
        }

        Spacer(modifier = modifier.height(32.dp))

        Text(
            "Recommended Combo",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            modifier = modifier.padding(bottom = 16.dp)
        )

        LazyRow (
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.padding(bottom = 32.dp)
        ) {
            items(2){index ->

                RecommendedComboCard(
                    name = if (index == 0) "Honey Limb combo" else " Berry mango combo",
                    price = if (index == 0) "$1000" else "$800",
                    imageRes = if (index == 0) R.drawable.food_1 else R.drawable.food_2
                )
            }
        }

        //Category tab
        LazyRow (
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            modifier = modifier.padding(bottom = 16.dp)
        ){
            items(listOf("Hottest", "Popular", "New combo", "Top")){ category ->
                Text(
                    text = category,
                    fontSize = 16.sp,
                    fontWeight = if (category == "Hottest") FontWeight.Bold else FontWeight.Normal
                )
            }
        }

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(7.dp),
        ) {
            items(3){index ->
                ComboCard(
                    name = if(index == 0) "thit chien"
                            else if(index == 1) "ca kho to"
                            else "ga nuong",
                    price = if(index == 0) "50K"
                            else if(index == 1) "70K"
                            else "90K",
                    imageRes = if(index == 0) R.drawable.food_1
                    else if(index == 1) R.drawable.food_2
                    else R.drawable.food_4
                )
            }
        }
        Spacer(modifier = modifier.height(10.dp))


        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {
            val comboList = listOf(
                ComboItem("lau ech","130k", R.drawable.food_4),
                ComboItem("chao vit","110k", R.drawable.food_2),
                ComboItem("men` men'","160k", R.drawable.food_1)
            )
            items(comboList){ item ->
                ComboCard(
                    name = item.name,
                    price = item.price,
                    imageRes = item.imageRes
                )
            }
        }
    }//main column
}


@Composable
fun RecommendedComboCard(modifier: Modifier = Modifier, name: String, price: String, imageRes: Int) {
    Card(
        modifier = modifier.width(152.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = modifier.padding(start = 26.dp)
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint = Color(0xFFFF8C42),
                    modifier = modifier.size(20.dp)
                )
            }
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = modifier.size(80.dp)
            )

            Spacer(modifier = modifier.height(12.dp))

            Text(
                text = name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )

            Spacer(modifier = modifier.height(8.dp))

            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = price,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF8C42)
                )

                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(0xFFFF8C42),
                    modifier = modifier
                        .size(24.dp)
                        .padding(4.dp)
                        .background(color = Color(0xFFFFF2E7), shape = CircleShape)
                )
            }
        }

    }
}

@Composable
fun ComboCard(modifier: Modifier = Modifier, name: String, price: String, imageRes: Int) {

        Card(
            modifier = modifier
                .width(100.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = modifier
                    .padding(start = 16.dp)
            ) {
                Row(
                    modifier = modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = null,
                        tint = Color.Red,
                        modifier = modifier.size(20.dp)
                    )
                }
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier = modifier.size(80.dp)
                )
                Spacer(modifier = modifier.height(10.dp))
                Text(
                    name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = modifier.height(10.dp))
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(end = 7.dp)
                        .background(
                            color = Color(0x3374777a),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = null,
                        modifier = modifier.size(20.dp)
                    )
                    Spacer(modifier = modifier.width(5.dp))
                    Text(price)
                    Spacer(modifier = modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        modifier = modifier
                            .background
                                (
                                color = Color.White,
                                shape = CircleShape,
                                )
                            .size(15.dp)
                    )
                }
            }

        }

}

@Composable
@Preview(showBackground = true)
fun HomeScreenPrev(modifier: Modifier = Modifier) {
    HomeScreen()
//    ComboCard(name = "An", price = "$500", imageRes = R.drawable.food_4)
//    RecommendedComboCard(name = "Samosa", price = "200", imageRes = R.drawable.food_1)
}