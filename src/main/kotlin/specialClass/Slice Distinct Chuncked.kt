package org.dicoding.kotlin.specialClass

val totalz = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val slice = totalz.slice(3..6)
val slices = totalz.slice(3..6 step 2)

val index = listOf(2, 3, 5, 8)
val slicez = totalz.slice(index)

val totala = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
val distinct = totala.distinct()

val word = "QWERTY"
val chunked = word.chunked(3)
val chunkedTransform = word.chunked(3) {
    it.toString().lowercase()
}

fun main(){
    println(slice)
    println(slices)
    println(slice)
    println(distinct)
    println(chunked)
    println(chunkedTransform)
}
