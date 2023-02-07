package com.example.recycler_view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view.City

class CitiesAdapter : RecyclerView.Adapter<CityViewHolder>() {
    private val citiesList = mutableListOf<City>()

    fun setList(citiesList: List<City>) {
        this.citiesList.addAll(citiesList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {

    }

    override fun getItemCount(): Int = citiesList.size

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
    }
}