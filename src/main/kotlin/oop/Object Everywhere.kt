package org.dicoding.kotlin.oop

fun main() {
    val someString = "123"
    println(someString.reversed())
    println(someString.uppercase())
    println(someString.lowercase())

    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}