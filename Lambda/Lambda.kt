package Exercicios.Kotlin

fun loteriaDosSonhos(){
    val listadossonhos = mapOf<Int,String>(1 to "Num1", 2 to "Num2", 3 to "Num3", 4 to "num4")
    for(i in listadossonhos){
        println("${i.key} - ${i.value}")
}
}



