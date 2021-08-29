package Exercicios.Kotlin.ContaNoBanco

import Exercicios.Kotlin.ContaBanco.ClientesEContas
import Exercicios.Kotlin.ContaBanco.Conta

fun main() {
    var cliente1 = ClientesEContas("Bruno", "Ribeiro")
    var cliente2 = ClientesEContas("Livia", "Pereira")

    println("Olá, ${cliente1.nome} ${cliente1.sobrenome}")
    var contaCliente1 = Conta(5585, 52.41, cliente1).deposito(45.80)
    println("_______________________________________________")

    println("Olá, ${cliente2.nome} ${cliente2.sobrenome}")
    var contaCliente2 = Conta(5488,0.0, cliente2).saque(785.41)
    println("_______________________________________________")

}