package org.dicoding.kotlin.specialClass

class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

fun main() {
    Library.Companion.borrowBookById(21)
    Library.borrowBookById(21)
}