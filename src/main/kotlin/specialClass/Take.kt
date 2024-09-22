package org.dicoding.kotlin.specialClass

val totals = listOf(1, 2, 3, 4, 5, 6)
val take = totals.take(3)
val takel = totals.takeLast(3)

fun main(){
    println(take)
    println(takel)
}