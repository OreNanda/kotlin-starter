package org.dicoding.kotlin.oop

class Hewans(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)
fun main(){
    val dicodingCat = Hewans("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}