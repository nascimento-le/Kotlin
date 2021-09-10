package Exercicios.Kotlin.Desafio

import Exercicios.Kotlin.Desafio.Professor
import Exercicios.Kotlin.Desafio.Aluno
import Exercicios.Kotlin.Desafio.Curso
import Exercicios.Kotlin.Desafio.Matricula

class DigitalHouseManager(){

    private var listaAluno = mutableListOf<Aluno>()
    private var listaProfessor = mutableListOf<Professor>()
    private var listaCurso = mutableListOf<Curso>()
    private var listaMatricula = mutableListOf<Matricula>()


    fun registrarCurso(
        nome: String,
        codigoCurso: Int,
        qtdMaximaDeAlunos: Int
    ){

    }

    fun excluirCurso(
        codigoCurso: Int
    ){
        for (i in listaCurso){
            if (i == listaAluno){
                listaCurso.remove(codigoCurso)
                }
            }
        }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        qtdDeHoras: Int
    ):Professor{

    }


    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        qtdDeHoras: Int
    ):Professor{

    }
}
