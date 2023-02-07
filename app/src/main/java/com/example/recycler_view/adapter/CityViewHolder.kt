package com.example.recycler_view.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recycler_view.City
import com.example.recycler_view.R

class CityViewHolder(itemView: View) : ViewHolder(itemView) {
    fun bind(item: City) {
        val texNameCity: TextView = itemView.findViewById(R.id.textViewCity)
        val textPopulation: TextView = itemView.findViewById(R.id.textViewPopulation)
        texNameCity.text = item.name
        textPopulation.text = item.population.toString()
    }
}