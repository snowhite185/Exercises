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
        val diceNo = Random.nextInt(1, 7)
        println("Your dice shows : $diceNo")
        if (diceNo == 6 && maxRoll < 3) {
            maxRoll++
            roll()
        }
    }

}

fun main() {
    val dice = Dice()
    dice.roll()
}