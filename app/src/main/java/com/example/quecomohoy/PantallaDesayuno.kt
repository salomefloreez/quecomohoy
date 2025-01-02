package com.example.quecomohoy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PantallaDesayuno(modifier: Modifier = Modifier) {
    ElevatedCard(
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ){
        Column {
          Image(
              painter = painterResource(id = R.drawable.pancakes),
              contentDescription = null,
              modifier = Modifier.size(50.dp)
          )
            Text(text = "Pancakes")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PantallaDesayuno() {
}
