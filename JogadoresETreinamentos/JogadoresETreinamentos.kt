package classes.Kotlin

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    fun fazerGol() {
        energia = energia - 5
        alegria = alegria + 10
        gols += 1
        return println("GOOOOL")
    }

    fun correr() {
        energia = energia - 10
        return println("Cansei")
    }
}

class SessaoDeTreinamento(experiencia: Int){

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){
       jogadorDeFutebol.correr()
       jogadorDeFutebol.fazerGol()
       jogadorDeFutebol.correr()

       println("Experiência Inicial: ${jogadorDeFutebol.experiencia}")
       jogadorDeFutebol.experiencia += 3
       println("Experiência Final: ${jogadorDeFutebol.experiencia}")
    }

}

