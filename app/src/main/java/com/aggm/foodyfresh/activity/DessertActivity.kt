package com.aggm.foodyfresh.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aggm.foodyfresh.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class DessertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert)

        val dessertTabLayout = findViewById<TabLayout>(R.id.dessert_layout)
        val desserts = findViewById<TabItem>(R.id.desserts)
        val newDessert = findViewById<TabItem>(R.id.new_dessert)
    }
}