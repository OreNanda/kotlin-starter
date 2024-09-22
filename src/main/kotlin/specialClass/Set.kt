package org.dicoding.kotlin.specialClass

fun main(){
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA)
    println(setA == setB)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    val numbers = setOf("one", "two", "three")
    val numbers2 = setOf("three", "four")

    println((numbers - numbers2) union (numbers2 - numbers))
}