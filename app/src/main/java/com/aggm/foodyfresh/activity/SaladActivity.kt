package com.aggm.foodyfresh.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aggm.foodyfresh.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class SaladActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salad)

        val saladTabLayout = findViewById<TabLayout>(R.id.salad_layout)
        val salads = findViewById<TabItem>(R.id.salads)
        val newSalad = findViewById<TabItem>(R.id.new_salad)
    }
}