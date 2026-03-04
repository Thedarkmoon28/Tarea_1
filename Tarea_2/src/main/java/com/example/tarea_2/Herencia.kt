package com.example.tarea_2

//Objetivo
//Entender cómo una clase puede heredar propiedades y métodos de otra clase, y personalizar
//su comportamiento.
//¿Qué debes hacer?
//• Crea la clase base Animal con propiedades: nombre (String) y edad (Int).
//• Agrega a Animal el método hacerSonido() que imprima: 'Sonido genérico.'
//• Agrega a Animal el método describirse() que imprima: 'Soy [nombre] y tengo [edad]
//años.'
//• Crea las clases Perro, Gato y Vaca que hereden de Animal.
//• Cada subclase debe sobreescribir hacerSonido() con su sonido propio (¡Guau!, ¡Miau!,
//¡Mu!).
//• En main(), crea un animal de cada tipo y llama sus métodos.

open class Animal(val nombre: String, val edad: Int) {

    open fun hacerSonido() {
        println("Sonido genérico.")
    }

    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}

class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Guau!")
    }
}

class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Miau!")
    }
}

class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        println("¡Mu!")
    }
}

fun main() {

    val perro = Perro("Rex", 3)
    val gato = Gato("Michi", 2)
    val vaca = Vaca("Lola", 5)

    perro.describirse()
    perro.hacerSonido()

    gato.describirse()
    gato.hacerSonido()

    vaca.describirse()
    vaca.hacerSonido()
}