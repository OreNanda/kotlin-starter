package org.dicoding.kotlin.controlFlow

import kotlin.random.Random

fun main() {
    val value = 20

    when(value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    val stringOfValues = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }

        7 -> {
            println("Seven")
            "value is 7"
        }

        8 -> {
            println("Eight")
            "value is 8"
        }

        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

    val anyType : Any = 100L
    when(anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }
    
}