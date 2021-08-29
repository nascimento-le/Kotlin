package Exercicios.Kotlin

open class Animal{
    var nomeDoAnimal: String = ""
    var tamanho: Int = 0
    var cor: String = ""

    open fun correr() {
        println("Animal está correndo.")
    }
}

