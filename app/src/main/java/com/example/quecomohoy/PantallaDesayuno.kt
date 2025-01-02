package com.example.quecomohoy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaDesayuno(modifier: Modifier = Modifier) {
    Box(
    ){

        Text(text = "Pancakes")
    }

    Column (
        modifier = Modifier.padding(25.dp, 25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){


    Card(
        modifier = modifier
            .width(350.dp),
        colors = CardDefaults.cardColors(Color.White)



    ){
        Column(
           verticalArrangement = Arrangement.Bottom,
        ) {
          Image(
              painter = painterResource(id = R.drawable.pancakes),
              contentDescription = null,
              contentScale = ContentScale.FillWidth
          )

                Row(
                    modifier = Modifier.fillMaxWidth().padding(0.dp,10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text("5-10 mins", fontSize = 14.sp)
                    Text("Medio",fontSize = 14.sp )
                }
            Text(
                text = "Tostadas de aguacate con huevo poché",
                modifier = Modifier.padding(0.dp,0.dp,0.dp, 10.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inter_semibold)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF000000),
                )
            )


        }

    }
    }
}


