package com.example.weatherforecast1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settings.setOnClickListener {
            draw_layout_main.openDrawer(nav_view)
        }
//        test.setOnClickListener {
//            startActivity(Intent(this, DetailsActivity::class.java))
//        }
    }
}