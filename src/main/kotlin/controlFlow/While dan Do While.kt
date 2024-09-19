package org.dicoding.kotlin.controlFlow

fun main() {
    var counter = 1
    while (counter <= 2){
        println("Hello, World!")
        counter++
    }

    var counters = 1
    do {
        println("Hello, World!")
        counters++
    } while (counters <= 2)
}