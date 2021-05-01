package com.aggm.foodyfresh.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aggm.foodyfresh.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class MainDishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maindish)

        val mainDishTabLayout = findViewById<TabLayout>(R.id.main_dish_layout)
        val mainDishes = findViewById<TabItem>(R.id.main_dishes)
        val newMainDish = findViewById<TabItem>(R.id.new_main_dish)
    }
}