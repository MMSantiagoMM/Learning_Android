package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled",Toast.LENGTH_SHORT)
            toast.show()
            rollDice()
        }

    }
    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }


    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = diceRoll.toString()
    }
}