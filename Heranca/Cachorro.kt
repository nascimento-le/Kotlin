package Exercicios.Kotlin.Heranca

import Exercicios.Kotlin.Animal

class Cachorro: Animal() {

    override fun correr() {
        return println("Cachorro está correndo")
    }
}