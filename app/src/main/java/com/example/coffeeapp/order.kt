package com.example.coffeeapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class order : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)


        val order = findViewById<TextView>(R.id.tv)

        val orderofcust = intent.getStringExtra(MainActivity.KEY)

        order.text = orderofcust

        val ordermore = findViewById<Button>(R.id.ordermore)

        ordermore.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }





        }
    }
