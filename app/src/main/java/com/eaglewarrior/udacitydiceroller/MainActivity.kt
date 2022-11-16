package com.eaglewarrior.udacitydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbtn: Button = findViewById(R.id.roll_btn)
        rollbtn.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.dice_tv)
        resultText.text = "Dice Roll"
    }
}
