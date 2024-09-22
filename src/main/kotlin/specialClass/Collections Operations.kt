package org.dicoding.kotlin.specialClass

val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val notEvenList = numberList.filterNot { it % 2 == 0 }

val multipliedBy5 = numberList.map { it * 5 }

val firstOddNumber = numberList.find { it % 2 == 1 }
val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }

//val moreThan10 = numberList.first { it > 10 }

val total = numberList.sum()

val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
val ascendingSort = kotlinChar.sorted()
val descendingSort = kotlinChar.sortedDescending()

fun main(){
    println(notEvenList)
    println(multipliedBy5)
    println(numberList.count())
    println(numberList.count { it % 3 == 0 })
    println(firstOddNumber)
    println(firstOrNullNumber)
    //println(moreThan10)
    println(total)
    println(ascendingSort)
    println(descendingSort)
}