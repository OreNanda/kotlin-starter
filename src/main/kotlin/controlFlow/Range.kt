package org.dicoding.kotlin.controlFlow

fun main() {
    val range = 1..10
    println(range.step)

    val rangeInt = 1.rangeTo(10) step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)

    val downTo = 10.downTo(1)
    downTo.forEach {
        println("$it ")
    }
}