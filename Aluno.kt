package classes

class Aluno(var nome: String, var sobrenome: String, var idade: Int){

    var curso: String = ""

    constructor(nome: String, sobrenome: String,idade: Int, curso: String): this(nome, sobrenome,idade){
        this.curso  = curso
    }
}

fun main() {
    val aluno = Aluno("Letícia", "Nascimento", 25,"Desenvolvimento Mobile")

    println(aluno.nome + " " + aluno.sobrenome + ", " + aluno.idade + " anos / " + aluno.curso)
}