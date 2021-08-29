package Exercicios.Kotlin.ContaBanco

class ClientesEContas(var nome: String, var sobrenome: String) {
}

class Conta(var numConta: Int, var saldo: Double, titular: ClientesEContas){

    fun deposito(entradaDinheiro: Double) {
        if(entradaDinheiro > 0){
            saldo += entradaDinheiro
            println("Transação realizada! Seu novo saldo é R$$saldo ")
        }else{
            println("Transação não realizada.")
        }
        }

    fun saque(saidaDinheiro: Double){
        if (saldo <= 0){
            println("Saldo insuficiente.")
        }else{
            saidaDinheiro - saldo
            println("Transação realizada! Seu novo saldo é R$$saldo")
        }
    }

}

