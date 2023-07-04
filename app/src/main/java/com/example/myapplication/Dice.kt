package com.example.myapplication

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.random.nextInt

class Dice {

    fun roll() {
        runBlocking {
            println("Rolling......")
            delay(5000)
        }
        val diceNo = Random.nextInt(1, 6)
        println("Your dice shows : $diceNo")
        if (diceNo == 6) {
            roll()
        }
    }

}

fun main() {
    val dice = Dice()
    dice.roll()
}