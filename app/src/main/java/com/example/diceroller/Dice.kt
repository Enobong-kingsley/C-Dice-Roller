package com.example.diceroller

class Dice(val numberOfSides:Int) {
   // var color : Array<String>

    fun roll() : Int{
       // color  = arrayOf("Red","Blue","Yellow","Green","Purple","White")
        return (1..numberOfSides).random()

       // print("the random number is $randomNumber")

    }

}

fun main(args: Array<String>) {
    val myFirstDice = Dice(6)
   // val mySecondDice = Dice(20)
    val diceRollResult = myFirstDice.roll()
  //  val secondDiceRoll = mySecondDice.roll()
   // println("Your ${ myFirstDice.numberOfSides} sided dice is $diceRollResult")
   // println("Your ${ mySecondDice.numberOfSides} sided dice is $secondDiceRoll")
    val luckyNumber = 5
    val winStatement = "You Win"
    val failedStatement = "sorry, you failed!"
    if (diceRollResult == luckyNumber){
        println(winStatement)
    }else{
        println(failedStatement)
    }

    when(diceRollResult){
        luckyNumber -> println("You win")
        1 -> println("you had a 1 so try again")
        2 -> println("you had a 2 so try again")
        3 -> println("you had a 3 so try again")
        4 -> println("you had a 4 so try again")
        5 -> println("you had a 5 so try again")

        else -> println("the number is not included")
    }




}