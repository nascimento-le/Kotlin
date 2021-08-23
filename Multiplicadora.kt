package classes.Kotlin

fun main() {
    val multiplicadora = Multiplicadora(arrayListOf(4,5,8,2,6,1))
    println(multiplicadora.produto())
}

class Multiplicadora( var list: ArrayList<Int>) {

    var resultado: Int = 1

    fun produto(): Int{
        return if (list.isEmpty()){
            0
        }else{
            for (i in list){
                resultado *= i
            }
            resultado
        }
    }
}

