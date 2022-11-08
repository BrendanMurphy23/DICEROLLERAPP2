package com.example.dicerollerapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)


        rollButton.text = "Let's Roll"

        rollButton.setOnClickListener {
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
            //number.text = "Dice have been rolled"
            rollDice()
        }
    }

    private fun rollDice() {
        val number: TextView = findViewById(R.id.number_text)
        val randNumber = Random.nextInt(6)+1
        number.text = randNumber.toString()

    }


}