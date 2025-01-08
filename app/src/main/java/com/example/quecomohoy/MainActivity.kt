package com.example.quecomohoy


import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.recyclerview.widget.RecyclerView
import coil.compose.AsyncImage
import com.example.quecomohoy.adapter.RecetasAdapter
import com.example.quecomohoy.claseListaReceta.ClaseParaRecetas
import com.example.quecomohoy.recetarioimg.Receta
import com.example.quecomohoy.ui.theme.QuecomohoyTheme



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuecomohoyTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    PantallaRecetaCompleta()
                }
            }


        }
    }
}

val listaRecetas = arrayListOf<ClaseParaRecetas>(
    ClaseParaRecetas("Desayuno","Tortitas de Calabaza", "30 minutos", "Medio", "https://www.allrecipes.com/thmb/dWCWPR2DRClKJCxdGtdOKT_b_OY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/17036-pumpkin-pancakes-DDMFS-4x3-4d3a11ea4d354fd29f1e2beab40e76cd.jpg", "descripcion" ),
    ClaseParaRecetas("Desayuno","Bizcocho Casero de Yogur", "40 minutos", "Medio", "https://www.foodandwine.com/thmb/HKU0wtbF3a1I30_q8KYdodqFZ7s=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Gateau-au-Yaourt-Yogurt-Cake-slices-FT-MAG-RECIPE-0624-db9f5550a687496ab5fd4d5fc7cc98b9.jpg", "descripcion" ),
    ClaseParaRecetas("Desayuno","Tortitas de Avena", "15 minutos", "Facil", "https://www.allrecipes.com/thmb/UJpj_y6SA2BKT2hhxcDjjFvlg6Y=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/21384-OatmealPancakesII-ddmfs-2x1-79711-65d4607d24c34d41b0b1533e81b2ee14.jpg", "descripcion" ),
    ClaseParaRecetas("Desayuno","Batido Energético de Frutas", "10 minutos", "Facil",
        "https://bishopsorchards.com/wp-content/uploads/2017/11/bigstock-Glasses-of-fresh-cold-smoothie-112745981.jpg", "descripcion" ),
    ClaseParaRecetas("Desayuno","Avena con Frutas y nueces", "15 minutos", "Facil", "https://d1c8xu194km6ge.cloudfront.net/assets/326360/Fruit_and_Nut_Oatmeal_HD-1_HD1280.jpg", "descripcion" ),
    ClaseParaRecetas("Desayuno","Burrito de Desayuno", "25 minutos", "Medio", "https://www.allrecipes.com/thmb/eW1GvzDZ9yI3ex_Ac0b3HKOHPhQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/261844-freeze-and-reheat-breakfast-burritos-ddmfs-1X2-0361-6a522d76eb3d4a60976a2c26bb3b525a.jpg", "descripcion" ),
    ClaseParaRecetas("Desayuno","Porridge de Chufa y Fruta", "15 minutos", "Facil", "https://www.frozenfruit.co.uk/media/magefan_blog/fruit-porridge-recipes-feat.jpg", "descripcion" ),
    ClaseParaRecetas("Comida","Albóndigas en Salsa Española", "50 minutos", "Dificil", "https://www.laespanolaaceites.com/wp-content/uploads/2019/06/albondigas-en-salsa-1080x671.jpg", "descripcion" ),
    ClaseParaRecetas("Comida","Espaguetti al Pesto", "30 minutos", "Medio", "https://images.themodernproper.com/billowy-turkey/production/posts/PestoSpaghetti_7.jpg?w=1200&h=1200&q=60&fm=jpg&fit=crop&dm=1708554018&s=c511399d66f985f0ebb43e190ee13cae", "descripcion" ),
    ClaseParaRecetas("Comida","Pollo al Limón", "40 minutos", "Dificil", "https://www.simplyrecipes.com/thmb/QMYd7a-qCxzivOS_CYUZEjuVRbk=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2010__03__lemon-chicken-horiz-a-1600-c2d39b9c29654638b1d9c6fd98b64991.jpg", "descripcion" ),
    ClaseParaRecetas("Comida","Quesadillas de champiñones", "25 minutos", "Fácil", "https://www.simplyrecipes.com/thmb/HPldLEp9E0wbZF3s6XvOsI-h0HU=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2019__03__Mushroom-Quesadilla-LEAD-1-122477758cee4ba29b4e7b1053ca8ff6.jpg", "descripcion" ),
    ClaseParaRecetas("Comida","Tallarines Udon", "30 minutos", "Dificil", "https://chefatulya.com/wp-content/uploads/2020/08/D129A118-8120-49AA-8445-ADBDBF7BA765.jpg", "descripcion" ),
    ClaseParaRecetas("Comida","Wrap de Pollo y Vegetales", "25 minutos", "Medio", "https://whatsfordinner.com/wp-content/uploads/2017/02/chicken-vegetable-wrap-sandwich-recipe.jpg", "descripcion" ),
    ClaseParaRecetas("Comida","Filete de Pescado al Horno", "35 minutos", "Medio", "https://www.allrecipes.com/thmb/oWL1qFaIpTSpZcn1PsiRc1KOLzU=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/AR-256348-Quick-and-Easy-Baked-Fish-Filet-ddmfs-2x1-4c75b65d288949049abd52672151325a.jpg", "descripcion" ),
    ClaseParaRecetas("Comida","Ensalada Campera", "20 minutos", "Facil", "https://i.blogs.es/4753ad/ensalada_campera-copia/650_1200.jpg", "descripcion" ),
    ClaseParaRecetas("Cena","Revuelto de Setas y Ajetes", "20 minutos", "Medio", "https://www.eladerezo.com/wp-content/uploads/2009/04/revuelto-de-ajetes-tiernos-con-esparragos-trigueros-y-langostinos-12-933x700.jpg", "descripcion" ),
    ClaseParaRecetas("Cena","Sepia a la plancha", "20 minutos", "Facil", "https://imag.bonviveur.com/sepia-a-la-plancha-con-ajo-y-perejil-servida-en-un-plato.jpg", "descripcion" ),
    ClaseParaRecetas("Cena","Calabacín relleno de atún y huevo", "30 minutos", "Medio", "https://cdn0.recetasgratis.net/es/posts/7/0/7/calabacines_rellenos_de_atun_y_mayonesa_64707_orig.jpg", "descripcion" ),
    ClaseParaRecetas("Cena","Sopa de Calabaza", "40 minutos", "Medio", "https://imag.bonviveur.com/sopa-de-calabaza.jpg", "descripcion" ),
    ClaseParaRecetas("Cena","Saltadeado de Verduras y Tofu", "35 minutos", "Facil", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8l25Dik801YHZr630VoBD-1KMl41qpHKlpg&s", "descripcion" ),
    ClaseParaRecetas("Cena","Tortilla de Espinacas y Piñones", "20 minutos", "Medio", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSY8m-NAV-H5VWME5naRVlmmBlA_l6KXzWNJg&s", "descripcion" ),
    ClaseParaRecetas("Cena","Pimientos rellenos de Bacalao", "45 minutos", "Dificil", "https://imag.bonviveur.com/pimientos-rellenos-de-bacalao.jpg", "descripcion" ),

    )

@Composable
fun TarjetaReceta(nueva_receta: ClaseParaRecetas) {

    Column (
        modifier = Modifier.padding(25.dp, 45.dp, 25.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {


        Card(
            modifier = Modifier.width(350.dp),
            colors = CardDefaults.cardColors(Color.White)


        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
            ) {
                AsyncImage(
                    model = nueva_receta.imagen,
                    contentDescription = nueva_receta.titulo,
                    contentScale = ContentScale.FillWidth
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(nueva_receta.tiempo, fontSize = 14.sp)

                    Text(nueva_receta.dificultad, fontSize = 14.sp)
                }
                Text(text = "Comida",
                    fontSize = 32.sp,
                    fontFamily = FontFamily(Font(R.font.alfa_slab_one)),
                    modifier = Modifier.padding(30.dp, 0.dp)
                )

            }

        }
    }
}

@Composable
fun PantallaHome(modifier: Modifier = Modifier) {

}

@Composable
fun PantallaDesayunoBeta() {
    PantallaDesayuno()

}







