package org.dicoding.kotlin.controlFlow

fun main() {
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

    val range = 1.rangeTo(10) step 3
    for ((index, value) in range.withIndex()) {
        println("value $value with index $index")
    }

    ranges.forEach { value ->
        println("value is $value!")
    }

}