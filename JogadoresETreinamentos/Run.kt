package classes.Kotlin.JogadoresETreinamentos

import classes.Kotlin.JogadorDeFutebol
import classes.Kotlin.SessaoDeTreinamento

fun main() {
    val jogador1 = JogadorDeFutebol("Marina", 8,10,0,6)
    val jogador2 = JogadorDeFutebol("Paula", 10, 8, 0, 8)

    SessaoDeTreinamento(jogador1.experiencia).treinarA(jogador1)
    println(" O jogador(a) ${jogador1.nome} está com ${jogador1.energia} pontos de energia,\n está com ${jogador1.alegria} pontos de alegria, fez ${jogador1.gols} gol(s) e\n tem ${jogador1.experiencia} pontos de experiência.")
    println("------------------------------------------------------")

    SessaoDeTreinamento(jogador2.experiencia).treinarA(jogador2)
    println(" O jogador(a) ${jogador2.nome} está com ${jogador2.energia} pontos de energia,\n está com ${jogador2.alegria} pontos de alegria, fez ${jogador2.gols} gol(s) e\n tem ${jogador2.experiencia} pontos de experiência.")
    println("------------------------------------------------------")


}