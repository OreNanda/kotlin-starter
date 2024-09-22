package org.dicoding.kotlin.specialClass

val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
)

val mapKeys = capital.keys
val mapValues = capital.values

fun main() {
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))
    println(mapKeys)
    println(mapValues)
}