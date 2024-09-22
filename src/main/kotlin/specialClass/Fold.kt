package org.dicoding.kotlin.specialClass

val numbers = listOf(1, 2, 3)
val fold = numbers.fold(10) { current, item ->
    println("current $current")
    println("item $item")
    println()
    current + item
}

val foldr = numbers.foldRight(10) { item, current ->
    println("current $current")
    println("item $item")
    println()
    item + current
}

fun main (){
    println("Fold result: $fold")
    println("Fold result: $foldr")
}