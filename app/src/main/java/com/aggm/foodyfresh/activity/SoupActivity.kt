package com.aggm.foodyfresh.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aggm.foodyfresh.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class SoupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert)

        val soupTabLayout = findViewById<TabLayout>(R.id.soup_layout)
        val soups = findViewById<TabItem>(R.id.soups)
        val newSoup = findViewById<TabItem>(R.id.new_soup)
    }
}