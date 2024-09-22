package org.dicoding.kotlin.specialClass

val list = (1..10000).toList()
val numbera = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()

fun main(){
    println(numbera)
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}
