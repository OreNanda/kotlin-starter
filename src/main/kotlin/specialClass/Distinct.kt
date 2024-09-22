package org.dicoding.kotlin.specialClass

data class Item(val key: String, val value: Any)

val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
val distinctc = text.distinctBy {
    it.length
}

fun main(args: Array<String>) {
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    println(distinctc)
}