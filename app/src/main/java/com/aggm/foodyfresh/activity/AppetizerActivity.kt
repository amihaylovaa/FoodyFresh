package com.aggm.foodyfresh.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aggm.foodyfresh.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class AppetizerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appetizer)

        val appetizerTabLayout = findViewById<TabLayout>(R.id.appetizer_layout)
        val appetizers = findViewById<TabItem>(R.id.appetizers)
        val newAppetizer = findViewById<TabItem>(R.id.new_appetizer)
    }
}