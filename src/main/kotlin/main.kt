fun main() {
    val NNUMEROS = 99
    val MINALEATORIO = 0
    val MAXALEATORIO = 100

    var suma = 0
    var media = 0
    val lista = mutableListOf<Int>()

    for(i in 0..NNUMEROS){
        lista.add((MINALEATORIO..MAXALEATORIO).random())
        suma += lista[i]
    }

    media = suma/(NNUMEROS+1)
    println("Media: $media")

    lista.forEach {
        if(it >= media)
            println(it)
    }


}