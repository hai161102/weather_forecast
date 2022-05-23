package com.example.weatherforecast1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail.*
import utils.WeatherInTime

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_detail)
        val layoutManager : LinearLayoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter = DetailsAdapter(getList(), this)
        back_to_activity_before.setOnClickListener {
            finish()
        }
    }

    private fun getList(): ArrayList<WeatherInTime> {
        return ArrayList()
    }
}