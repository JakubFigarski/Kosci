package com.example.myapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    private var textViewResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_content)
        textViewResult = findViewById<TextView>(R.id.text1)
    }

    fun rollDice(view: View?) {
        val random = Random()
        val randomNumber = random.nextInt(6) + 1
        val resultText = "Wyrzucona liczba: $randomNumber"
        textViewResult!!.text = resultText
    }
}
