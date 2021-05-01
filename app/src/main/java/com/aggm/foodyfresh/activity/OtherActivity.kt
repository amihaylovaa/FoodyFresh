package com.aggm.foodyfresh.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aggm.foodyfresh.R
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val otherTabLayout = findViewById<TabLayout>(R.id.other_layout)
        val others = findViewById<TabItem>(R.id.others)
        val newOtherItem = findViewById<TabItem>(R.id.new_other_item)
    }
}