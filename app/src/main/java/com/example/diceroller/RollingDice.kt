package com.example.diceroller

class RollingDice {
    val i = 1
    var sides = 6

    fun roll(): Int {
        val randomNumber = (i..sides).random()
        print("the random number is $randomNumber")
        return randomNumber
    }
}

fun main(args: Array<String>) {
    val myFirstDice = RollingDice() // we created an instance of rolling dice
    // this is the print out of the roll function that was created
   val rollDice= myFirstDice.roll() // here we created an instance of the roll function, then  we got the property of the class (rollingDice)
    // so what ever you are telling the roll function to do, that is what will be printed
    println("The number of sides is ${ myFirstDice.sides}")
    println(rollDice)

    myFirstDice.sides = 20
    println("the number of sides was changed to ${myFirstDice.sides}")
}