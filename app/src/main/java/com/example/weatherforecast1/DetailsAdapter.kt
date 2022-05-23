package com.example.weatherforecast1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherforecast1.DetailsAdapter.ViewHolder
import kotlinx.android.synthetic.main.item_infomation.view.*
import utils.WeatherInTime

class DetailsAdapter(var list : ArrayList<WeatherInTime>,val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_infomation, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val weatherInTime : WeatherInTime = this.list[position]
        holder.itemView.time_or_date.text = weatherInTime.time.toString()
        holder.itemView.percent_rain_down.text = weatherInTime.percentRainDown.toString() + "%"
        holder.itemView.term.text = weatherInTime.term.toString()
        holder.itemView.mostly_cloudy.setOnClickListener {
            holder.itemView.item_info.openDrawer(holder.itemView.more_info)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

}