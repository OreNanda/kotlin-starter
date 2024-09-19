package org.dicoding.kotlin.controlFlow

fun main() {
    val openOffice = 10
    val now = 20

    if (now > openOffice) {
        println("Office already open")
    } else {
        println("Office close")
    }

    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

    val value3 = 10
    val value4 = 10

    sum(1 , 1 * 4)
    sum(value3, value4)
}

fun sum(value1: Int, value2: Int) = println(value1+value2)