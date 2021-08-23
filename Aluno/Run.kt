package classes.Kotlin.Aluno

fun main() {
    val aluno = Aluno("Letícia", "Nascimento", 25,"Desenvolvimento Mobile")

    println(aluno.nome + " " + aluno.sobrenome + ", " + aluno.idade + " anos / " + aluno.curso)
}
