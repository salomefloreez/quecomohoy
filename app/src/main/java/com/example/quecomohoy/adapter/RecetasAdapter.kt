package com.example.quecomohoy.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.quecomohoy.R
import com.example.quecomohoy.recetarioimg.Receta


class RecetasAdapter(private val recetas: List<Receta>) : RecyclerView.Adapter<RecetasAdapter.RecetaViewHolder>() {

    // ViewHolder para cada ítem en la lista
    class RecetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val recetaImageView: ImageView = itemView.findViewById(R.id.recetaImageView)
        val recetaNombreTextView: TextView = itemView.findViewById(R.id.recetaNombreTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_receta, parent, false)
        return RecetaViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        val receta = recetas[position]
        holder.recetaNombreTextView.text = receta.nombre
        holder.recetaImageView.load(receta.imageUrl) {
        }
    }

    override fun getItemCount(): Int = recetas.size
}

