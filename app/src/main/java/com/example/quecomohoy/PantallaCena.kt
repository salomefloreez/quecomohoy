package com.example.quecomohoy

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaCena() {
    Text(text = "Desayuno",
        fontSize = 32.sp,
        fontFamily = FontFamily(Font(R.font.alfa_slab_one)),
        modifier = Modifier.padding(30.dp, 0.dp)
    )
    Column(
        Modifier. verticalScroll(rememberScrollState())
    ) {
        listaRecetas.forEach{ listElement ->
            TarjetaReceta(nueva_receta = listElement)
        }
    }
}
