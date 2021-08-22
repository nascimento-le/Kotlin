package classes

fun main() {
    var possoAposentar = Aposentar(60, "Homem", 34).contribuicao()
}

class Aposentar(var idade: Int,var sexo: String,var anosDeContribuicao: Int) {

    fun contribuicao() {
        if (idade >= 60 && sexo == "Mulher" && anosDeContribuicao >= 30) {
            println("Você pode se aposentar!")
        }else if (idade >= 65 && sexo == "Homem" && anosDeContribuicao >= 30){
            println("Você pode se aposentar!")
        }else{
            println("Você ainda não pode se aposentar.")
        }
    }
}



