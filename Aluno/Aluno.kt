package classes.Kotlin.Aluno

class Aluno(var nome: String, var sobrenome: String, var idade: Int){

    var curso: String = ""

    constructor(nome: String, sobrenome: String,idade: Int, curso: String): this(nome, sobrenome,idade){
        this.curso  = curso
    }
}

