package classes.Kotlin.Multiplicar

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

