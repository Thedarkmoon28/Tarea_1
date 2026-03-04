package com.example.tarea_2

//Objetivo
//Modelar una cuenta bancaria con saldo y operaciones básicas de depósito y retiro.
//¿Qué debes hacer?
//• Crea la clase CuentaBancaria con propiedades: titular (String) y saldo (Double, empieza
//en 0.0).
//• Agrega el método depositar(cantidad: Double) que sume al saldo e imprima el nuevo
//saldo.
//• Agrega el método retirar(cantidad: Double) que reste del saldo SOLO si hay suficiente
//dinero; si no, imprime un mensaje de error.
//• Agrega el método mostrarSaldo() que imprima el saldo actual del titular.
//• Prueba la cuenta realizando al menos 3 operaciones distintas.

class CuentaBancaria(val titular: String) {

    var saldo: Double = 0.0

    fun depositar(cantidad: Double) {
        if (cantidad > 0) {
            saldo += cantidad
            println("Depósito realizado. Nuevo saldo: $saldo")
        } else {
            println("La cantidad a depositar debe ser mayor que 0.")
        }
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= 0) {
            println("La cantidad a retirar debe ser mayor que 0.")
        } else if (saldo >= cantidad) {
            saldo -= cantidad
            println("Retiro realizado. Nuevo saldo: $saldo")
        } else {
            println("Error: Saldo insuficiente para retirar $cantidad")
        }
    }

    fun mostrarSaldo() {
        println("El saldo actual de $titular es: $saldo")
    }
}

fun main() {

    val cuenta = CuentaBancaria("María García")

    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)  // No debe permitirlo
    cuenta.mostrarSaldo()
}