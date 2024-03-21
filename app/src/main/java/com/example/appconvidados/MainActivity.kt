package com.example.appconvidados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<FloatingActionButton>(R.id.btnAdd)
        btnAdd.setOnClickListener{
            val intent = Intent(this@MainActivity, guest_form::class.java)
            startActivity(intent)
        }
    }
}