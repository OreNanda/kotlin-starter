package org.dicoding.kotlin.oop

class Animals{
    var name: String = "Dicoding Miaw"
}

class Hewan{
    var name: String = "Bangkit Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main(){
    val dicodingCat = Animals()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")

    val bangkitCat = Hewan()
    println("Nama: ${bangkitCat.name}")
    bangkitCat.name = "Budi"
    println("Nama: ${bangkitCat.name}")
}