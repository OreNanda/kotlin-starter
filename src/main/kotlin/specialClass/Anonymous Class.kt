package org.dicoding.kotlin.specialClass

interface IFly {
    fun fly()
}

fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    flyWithWings(object : IFly {
        override fun fly() {
            println("The Bird flying")
        }
    })
}