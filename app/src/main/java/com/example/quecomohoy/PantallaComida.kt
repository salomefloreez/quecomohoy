package com.example.quecomohoy

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.quecomohoy.claseListaReceta.ClaseParaRecetas


    @Composable
    fun PantallaComida() {
        Text(text = "Comida",
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

