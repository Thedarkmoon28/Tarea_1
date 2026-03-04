package com.example.tarea_2

//Objetivo
//Aprender a definir una interfaz y hacer que distintas clases la implementen de forma diferente.
//¿Qué debes hacer?
//• Define la interfaz Figura con dos métodos: calcularArea(): Double y calcularPerimetro():
//Double.
//• Crea la clase Rectangulo (base: Double, altura: Double) que implemente Figura.
//• Crea la clase Circulo (radio: Double) que implemente Figura. Usa Math.PI para el valor
//de pi.
//• En main(), crea un rectángulo y un círculo, e imprime su área y perímetro con 2
//decimales.

interface Figura {
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}

class Rectangulo(val base: Double, val altura: Double) : Figura {

    override fun calcularArea() = base * altura

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }
}

class Circulo(val radio: Double) : Figura {

    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }

    override fun calcularPerimetro(): Double {
        return 2 * Math.PI * radio
    }
}

fun main() {

    val rect = Rectangulo(5.0, 3.0)
    val circ = Circulo(4.0)

    println(
        "Rectangulo - Area: %.2f, Perimetro: %.2f"
            .format(rect.calcularArea(), rect.calcularPerimetro())
    )

    println(
        "Circulo    - Area: %.2f, Perimetro: %.2f"
            .format(circ.calcularArea(), circ.calcularPerimetro())
    )
}