package com.eaglewarrior.udacitydiceroller

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbtn: Button = findViewById(R.id.roll_btn)
        rollbtn.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1

        // Create and Random functionality to dice image
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}
