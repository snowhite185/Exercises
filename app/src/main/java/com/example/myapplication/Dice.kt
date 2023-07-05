package com.example.myapplication

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.random.nextInt

class Dice {

    private var maxRoll = 0

    fun roll() {
        runBlocking {
            println("Rolling......")
            delay(1000)
        }
        val diceNo = 6
        println("Your dice shows : $diceNo")
        if (diceNo == 6) {
            println("Max Roll : $maxRoll")
            if (maxRoll >= 3) {
                maxRoll = 0
            } else {
                maxRoll++
                roll()
            }


        }
    }

}

fun main() {
    val dice = Dice()
    dice.roll()
}