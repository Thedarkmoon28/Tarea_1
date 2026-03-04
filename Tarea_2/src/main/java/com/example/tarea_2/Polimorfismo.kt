package com.example.tarea_2

//Objetivo
//Usar polimorfismo para tratar objetos de diferentes clases de manera uniforme a través de una
//lista.
//¿Qué debes hacer?
//• Crea la clase abstracta Vehiculo con propiedades: marca (String) y velocidadMaxima
//(Int).
//• Agrega el método abstracto tipoVehiculo(): String.
//• Agrega el método mostrarInfo() que use tipoVehiculo() para imprimir: '[Tipo]: [marca] —
//Vel. máx: [velocidadMaxima] km/h'
//• Crea las clases Auto, Moto y Camion que hereden de Vehiculo e implementen
//tipoVehiculo().
//• En main(), crea una lista con al menos un vehículo de cada tipo y recórrela llamando
//mostrarInfo() en cada uno.

abstract class Vehiculo(val marca: String, val velocidadMaxima: Int) {

    abstract fun tipoVehiculo(): String

    fun mostrarInfo() {
        println("${tipoVehiculo()}: $marca — Vel. máx: $velocidadMaxima km/h")
    }
}

class Auto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Auto"
}

class Moto(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Moto"
}

class Camion(marca: String, velMax: Int) : Vehiculo(marca, velMax) {
    override fun tipoVehiculo() = "Camion"
}

fun main() {

    val vehiculos: List<Vehiculo> = listOf(
        Auto("Toyota", 180),
        Moto("Honda", 220),
        Camion("Volvo", 120)
    )

    for (vehiculo in vehiculos) {
        vehiculo.mostrarInfo()
    }
}