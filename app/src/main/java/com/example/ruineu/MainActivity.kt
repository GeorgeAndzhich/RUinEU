package com.example.ruineu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.absoluteValue
import kotlin.reflect.typeOf

var input = R.id.editTextNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        var result = findViewById<TextView>(R.id.textView)
        val input = findViewById<EditText>(R.id.editTextNumber)

        button.setOnClickListener{
           Convert()
        }
    }

    private fun Convert() {
        TODO("Not yet implemented")

    }
}






