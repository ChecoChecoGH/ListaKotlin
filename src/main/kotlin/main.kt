const val NNUMEROS = 99
const val MINALEATORIO = 0
const val MAXALEATORIO = 100

fun main() {
    var suma = 0

    val lista = mutableListOf<Int>()

    for(i in 0..NNUMEROS){
        lista.add((MINALEATORIO..MAXALEATORIO).random())
        suma += lista[i]
    }

    val media = suma/(NNUMEROS+1)
    println("Media: $media")

    lista.forEach {
        if(it >= media)
            println(it)
    }


}