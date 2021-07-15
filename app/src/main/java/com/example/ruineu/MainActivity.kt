package com.example.ruineu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.absoluteValue
import kotlin.reflect.typeOf



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        var result = findViewById<TextView>(R.id.textView)
        var input = findViewById<EditText>(R.id.editTextNumber)
        button.setOnClickListener{
            var Rubles = input.getText().toString().toInt()
            if (Rubles <= 0){
                Toast.makeText(this,"Введите значения больше нуля",Toast.LENGTH_SHORT).show()
            }
            else {
                var Converted = Rubles / 88
                result.setText(Converted.toString())
            }
        }
    }
}






