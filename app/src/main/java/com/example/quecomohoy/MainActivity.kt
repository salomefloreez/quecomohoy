package com.example.quecomohoy


import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.quecomohoy.adapter.RecetasAdapter
import com.example.quecomohoy.recetarioimg.Receta
import com.example.quecomohoy.ui.theme.QuecomohoyTheme



class MainActivity : ComponentActivity() {
    private val recetas= listOf(
        Receta("Tortitas de Calabaza","https://iili.io/2kLlbRa.th.jpg"),
        Receta("Bizcocho Casero de Yogur","https://i.ibb.co/vqXRhYb/Bizcocho-de-Yogur-casero-1-2-3-Peque-Recetas.jpg"),
        Receta("Tortitas de Avena","https://i.ibb.co/QNWrDdx/Receta-De-Tortitas-De-avena.jpg"),
        Receta("Batido Energético de frutas","https://i.ibb.co/cJ1D7HT/10-recetas-de-smoothies-de-frutas-muy-sanos-Pequeocio.jpg"),
        Receta("Avena con Frutas y Nueces","https://i.ibb.co/Bjvy1cy/12.jpg"),
        Receta("Burrito de Desayuno","https://i.ibb.co/68XqmJ0/15-Deliciosos-desayunos-con-los-que-no-te-aburrir-s-de-comer-huevo.jpg"),
        Receta("Porridge de Chufa y Fruta","https://i.ibb.co/XbRf8HP/Greek-Yogurt-Parfait-Recipe.jpg"),
        Receta("Albóndigas en Salsa Española","https://i.ibb.co/5YHptY2/Alb-ndigas-en-salsa-receta-tradicional-espa-ola-pero-con-un-toque-de-sabor-muy-especial.jpg"),
        Receta("Espagueti al Pesto","https://i.ibb.co/nfR7TCV/Pesto-Pasta.jpg"),
        Receta("Pollo al Limón","https://i.ibb.co/2WD2VkD/POLLO-AL-LIM-N-CHINO-Ap-ntate-este-recet-n-brutal-Hacemos-un-delicioso-pollo-rebozado-con-salsa-de-l.jpg"),
        Receta("Quesadillas de Champiñones","https://i.ibb.co/kQC9j6x/Mushrooms-Quesadillas.jpg"),
        Receta("Tallarines Udón","https://i.ibb.co/tqT4fxN/Schnelle-Kraut-Udon-Nudeln-mit-Spinat-Vegane-Yaki-Udon-Eat-this.jpg"),
        Receta("Wrap de Pollo y Vegetales","https://i.ibb.co/MSk5Fcx/Wrap-de-pollo-y-verduras-rico-y-saludable-a-la-par.jpg"),
        Receta("Filete de Pescado al Horno","https://i.ibb.co/41pqz4g/Grandes-recetas-diarias-El-Mejor-Pescado-Al-Horno-Del-Mediterr-neo-Facebook.jpg"),
        Receta("Ensalada Campera","https://i.ibb.co/3TPNhHB/Ensalada-campera-Eureka-Recetas.jpg"),
        Receta("Revuelto de Setas y Ajetes","https://i.ibb.co/KmW15kb/Receta-de-revuelto-de-setas-y-ajetes-Unareceta-com.jpg"),
        Receta("Sepia a la Plancha","https://i.ibb.co/bmmMj63/Sepia-salteada-con-alioli.jpg"),
        Receta("Calabacín relleno de Atún y Huevo","https://i.ibb.co/cN819S3/Calabacines-rellenos-de-at-n-y-queso-cena-f-cil-y-casera-lista-en-minutos.jpg"),
        Receta("Sopa de Calabaza y Zanahoria","https://i.ibb.co/BcWDwFV/Crema-de-Calabaza-Asada-con-Picatostes-de-Gruy-re-Paula-s-Apron.jpg"),
        Receta("Salteado de Verduras y Tofu","https://i.ibb.co/N1NmdWy/Easy-Tofu-Vegetable-Stir-Fry.jpg"),
        Receta("Tortilla de Espinacas y Piñones","https://i.ibb.co/9wWY2nm/Tarta-de-espinacas-con-pi-ones-una-receta-f-cil-y-cremosa-que-se-prepara-en-un-momento.jpg"),
        Receta("Pimientos Rellenos de Bacalao","https://i.ibb.co/nQJBX0F/Pimientos-rellenos-de-bacalao-y-gambitas-gratinados-con-queso.jpg"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurando RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recetasRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecetasAdapter(recetas)
    }
}





@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "tu puta madre no se hacer nada tio lloro $name!",
        modifier = modifier
    )
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuecomohoyTheme {
        Greeting("Android")
    }
}