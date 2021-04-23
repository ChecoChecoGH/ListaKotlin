fun main() {
    val NNUMEROS = 99

    var suma = 0
    var media = 0
    val lista = mutableListOf<Int>()

    for(i in 0..NNUMEROS){
        lista.add((0..100).random())
        suma += lista[i]
    }

    media = suma/NNUMEROS

    lista.forEach {
        if(it >= media)
            println(it)
    }


}