package Exercicios.Kotlin.Desafio
import Exercicios.Kotlin.Desafio.Matricula
import Exercicios.Kotlin.Desafio.Aluno
import Exercicios.Kotlin.Desafio.Professor

open class Curso(
    var nomeCurso: String = "",
    var codigoCurso: Int,
) {

    var titular = professorTitular()
    var adjunto = professorAdjunto()
    val qtdMaximaAluno = 30
    var contadorAluno = 0

    constructor(nomeCurso: String,codigoCurso: Int,titular: professorTitular,adjunto: professorAdjunto) : this(nomeCurso,codigoCurso){
        this.titular = professorTitular()
        this.adjunto = professorAdjunto()
    }

    var matriculados = mutableListOf<Aluno>()

    fun adicionarAluno(umAluno: Aluno): Boolean {
        if (contadorAluno <= qtdMaximaAluno) {
            matriculados.add(umAluno)
            contadorAluno++
            println("Aluno poderá ser inserido no curso")
        } else {
            println("Aluno não poderá ser inserido no curso, há falta de vagas")
        }

        fun excluirAluno(umAluno: Aluno) {
            for (i in matriculados) {
                if (i == umAluno) {
                    try {
                        matriculados.remove(umAluno)
                        contadorAluno -= 1
                        println("Aluno excluído do curso")
                    }
                }
            }
        }
    }
}

