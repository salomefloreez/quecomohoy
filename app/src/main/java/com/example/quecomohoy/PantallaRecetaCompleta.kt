package com.example.quecomohoy
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter

@Composable
fun PantallaRecetaCompleta() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE)) 
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {

            Image(
                painter = rememberAsyncImagePainter(model = "https://chefatulya.com/wp-content/uploads/2020/08/D129A118-8120-49AA-8445-ADBDBF7BA765.jpg"), // Cambia la URL por la de tu imagen
                contentDescription = "Imagen de tallarines Udon",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(30.dp))
                    .background(Color.White)
            ) {


                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "40-45 mins",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                        Text(
                            text = "Dificultad",
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Tallarines Udon",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.alfa_slab_one))
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Ingredientes",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "4 raciones",
                        fontSize = 14.sp,
                        color = Color.Gray

                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    val ingredientes = listOf(
                        "2 bolsitas tallarines gordos precocidos tipo Udón",
                        "1 filete grande de ternera",
                        "1 bolsa congelada de setas y champiñones",
                        "1 puerro",
                        "1 zanahoria",
                        "1/2 cebolla",
                        "Salsa de soja",
                        "Salsa barbacoa"
                    )
                    ingredientes.forEach { ingrediente ->
                        Text(text = "• $ingrediente", fontSize = 14.sp)
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Preparación",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    val pasos = listOf(
                        "Picamos en juliana la cebolla y la ponemos a pochar en una sartén a fuego medio.",
                        "Mientras se hace la cebolla, cortamos el puerro en tacos y lo añadimos a la sartén.",
                        "Pelamos y rallamos la zanahoria y la añadimos a la sartén.",
                        "Incorporamos la bolsa congelada de setas y champiñones y dejamos todo a fuego medio en sartén unos 15 minutos para que se haga bien.",
                        "Mientras hacemos el filete de ternera a la plancha en otra sartén.",
                        "Cortamos el filete en tiras no muy grandes y lo añadimos al sofrito.",
                        "Echas un buen chorro de salsa barbacoa y un chorro de salsa de soja y dejamos un par de minutos.",
                        "Si utilizas fideos udon precocidos, antes de añadirlos a la receta tienes que cocerlos en agua un par de minutos para que se suelten.",
                        "Añadir los fideos y mezclarlo todo. Prueba el sabor para ajustar las salsas si es necesario."
                    )
                    pasos.forEachIndexed { index, paso ->
                        Text(
                            text = "${index + 1}. $paso",
                            fontSize = 14.sp,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                    }
                }
            }
        }
    }
}