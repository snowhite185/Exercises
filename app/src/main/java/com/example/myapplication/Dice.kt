package com.example.myapplication

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.random.nextInt

class Dice {

    private var MAX_ROLL = 0

    fun roll() {
        runBlocking {
            println("Rolling......")
            delay(1000)
        }
        val diceNo = Random.nextInt(1, 6)
        println("Your dice shows : $diceNo")
        if (diceNo == 6 && MAX_ROLL < 3) {
            MAX_ROLL++
            roll()
        }
    }

}

fun main() {
    val dice = Dice()
    dice.roll()
}