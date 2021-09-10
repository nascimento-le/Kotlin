package Exercicios.Kotlin.Desafio

import Exercicios.Kotlin.Aluno.curso
import Exercicios.Kotlin.Desafio.Aluno as KotlinDesafioAluno

fun main() {
    var registrarProfessor1 = professorAdjunto(4.50, "Paulo", "Oliveira", "4 dias", 8846)
    var registrarProfessor2 = professorTitular("Química", "Pedro", "Portella", "3 meses", 6647)
    var registrarProfessor3 = professorTitular("Português", "Caio", "Santos", "2 anos", 6180)
    var registrarProfessor4 = professorAdjunto(33.78, "Pamela", "Antonella", "11 meses", 6546)

    println("Professor ${registrarProfessor1.nomeProfessor} ${registrarProfessor1.sobrenomeProfessor} foi registrado. \n Registro: ${registrarProfessor1.codigodoProfessor}")
    println("Professor ${registrarProfessor2.nomeProfessor} ${registrarProfessor2.sobrenomeProfessor} foi registrado. \n Registro: ${registrarProfessor2.codigodoProfessor}")
    println(-----------------------------------------------------------------------)


}