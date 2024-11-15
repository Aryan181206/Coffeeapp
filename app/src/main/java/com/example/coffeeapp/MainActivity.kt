package com.example.coffeeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
        const val KEY = "om.example.coffeeapp.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)




        val btnorder = findViewById<Button>(R.id.orderbtn)
        val odr1 = findViewById<EditText>(R.id.order1)
        val odr2 = findViewById<EditText>(R.id.order2)

        btnorder.setOnClickListener{
            val message = odr1.text.toString() + " \n" +odr2.text.toString()
            val intent = Intent(this,order:: class.java)
            intent.putExtra(KEY, message)
            startActivity(intent)
        }

        }
    }

private fun Intent.putExtra(key: Char, message: String) {

}


