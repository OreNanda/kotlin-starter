package org.dicoding.kotlin.specialClass

val number = listOf(1, 2, 3, 4, 5, 6)
val drop = number.drop(3)

val dropl = number.dropLast(3)

fun main(){
    println(drop)
    println(dropl)
}