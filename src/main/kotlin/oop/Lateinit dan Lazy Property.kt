package org.dicoding.kotlin.oop

lateinit var name: String
val nama: String by lazy {
    "Dicoding Rawr"
}

fun main() {
    name = "Dicoding Miaw"
    if (::name.isInitialized)
        println(name.length)
    else
        print("Not Initialized")
    println(nama)
}