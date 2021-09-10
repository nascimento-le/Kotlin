package Exercicios.Kotlin.Desafio
import Exercicios.Kotlin.Desafio.Professor

class professorTitular(
    var especialidade: String = "",
    nome: String,
    sobrenome: String,
    tempoDeCasa: String,
    codigo: Int
):Professor(nome, sobrenome, tempoDeCasa,codigo){

}

class professorAdjunto(
    var qtdHorasMonitoria: Double = 0.0,
    nome: String,
    sobrenome: String,
    tempoDeCasa: String,
    codigo: Int
): Professor(nome, sobrenome, tempoDeCasa,codigo) {
}