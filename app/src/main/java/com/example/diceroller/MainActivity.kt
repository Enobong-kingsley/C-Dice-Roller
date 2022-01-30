package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
//            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
//            toast.show()
//            val resultTextView = findViewById<TextView>(R.id.tv1)
//            resultTextView.text = "6"
            val diceImageView = findViewById<ImageView>(R.id.imageView)
            diceImageView.setImageResource(R.drawable.dice_2)

            rollDice()
        }
    }

    private fun rollDice() {
       val dice = diceRoll(6)
        val diceRoll = dice.roll()

//        val resultTextView: TextView = findViewById(R.id.tv1)
//        resultTextView.text = diceRoll.toString()
//        val scnResultTv : TextView = findViewById(R.id.tv2)
//        scnResultTv.text =diceRoll.toString()

        val diceImageView = findViewById<ImageView>(R.id.imageView)
        val diceImageView2 = findViewById<ImageView>(R.id.imageView2)
       when(diceRoll){

           1 -> diceImageView.setImageResource(R.drawable.dice_1)
           2 -> diceImageView.setImageResource(R.drawable.dice_2)
           3 -> diceImageView.setImageResource(R.drawable.dice_3)
           4 -> diceImageView.setImageResource(R.drawable.dice_4)
           5 -> diceImageView.setImageResource(R.drawable.dice_5)
           6 -> diceImageView.setImageResource(R.drawable.dice_6)
       }
        if (diceRoll == 1){
            diceImageView2.setImageResource(R.drawable.dice_1)
        }
        if (diceRoll == 2){
            diceImageView2.setImageResource(R.drawable.dice_2)
        }
        if (diceRoll == 3){
            diceImageView2.setImageResource(R.drawable.dice_3)
        }
        if (diceRoll == 4){
            diceImageView2.setImageResource(R.drawable.dice_4)
        }
        if (diceRoll == 5){
            diceImageView2.setImageResource(R.drawable.dice_5)
        }
        if (diceRoll == 6){
            diceImageView2.setImageResource(R.drawable.dice_6)
        }
    }
}

class diceRoll(private val numOfSides : Int){

    fun roll() : Int{
        return (1..numOfSides).random()
    }
}