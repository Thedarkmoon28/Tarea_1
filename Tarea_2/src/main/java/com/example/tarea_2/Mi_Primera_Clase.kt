package com.example.tarea_2

//Objetivo
//Crear una clase sencilla que represente a una persona con sus datos básicos.
//¿Qué debes hacer?
//• Crea una clase llamada Persona con las propiedades: nombre (String), edad (Int) y
//ciudad (String).
//• Agrega un método saludar() que imprima: 'Hola, me llamo [nombre] y tengo [edad]
//años.'
//• Agrega un método esMayorDeEdad() que regrese true si la edad es mayor o igual a 18.
//• En la función main(), crea dos personas distintas y llama sus métodos.
//Código de inicio


class Persona(val nombre: String, val edad: Int, val ciudad: String) {

    fun saludar() {
        println("Hola, me llamo $nombre y tengo $edad años.")
    }

    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }
}

fun main() {

    val persona1 = Persona("Ana", 20, "Guadalajara")
    val persona2 = Persona("Luis", 15, "León")

    persona1.saludar()
    println("${persona1.nombre} es mayor de edad: ${persona1.esMayorDeEdad()}")

    persona2.saludar()
    println("${persona2.nombre} es mayor de edad: ${persona2.esMayorDeEdad()}")
}