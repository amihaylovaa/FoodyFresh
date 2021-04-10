package com.aggm.foodyfresh.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import androidx.cardview.widget.CardView
import com.aggm.foodyfresh.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saladCV = findViewById<CardView>(R.id.salads)
        val appetizerCV = findViewById<CardView>(R.id.appetizers)
        val soupCV = findViewById<CardView>(R.id.soups)
        val mainDishCV = findViewById<CardView>(R.id.main_dishes)
        val dessertCV = findViewById<CardView>(R.id.desserts)
        val otherCV = findViewById<CardView>(R.id.others)


        saladCV.setOnClickListener(this)
        appetizerCV.setOnClickListener(this)
        soupCV.setOnClickListener(this)
        mainDishCV.setOnClickListener(this)
        dessertCV.setOnClickListener(this)
        otherCV.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var cardViewId = v?.id;

        when (cardViewId) {
            R.id.salads -> {
                val intent = Intent(this, SaladActivity::class.java)

                startActivity(intent)
            }
            R.id.appetizers
            -> {
                val intent = Intent(this, AppetizerActivity::class.java)

                startActivity(intent)
            }
            R.id.soups -> {
                val intent = Intent(this, SoupActivity::class.java)

                startActivity(intent)
            }
            R.id.main_dishes
            -> {
                val intent = Intent(this, MainDishActivity::class.java)

                startActivity(intent)
            }
            R.id.desserts
            -> {
                val intent = Intent(this, DessertActivity::class.java)

                startActivity(intent)
            }
            R.id.others
            -> {
                val intent = Intent(this, OtherActivity::class.java)

                startActivity(intent)
            }
        }
    }


}