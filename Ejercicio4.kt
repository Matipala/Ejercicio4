fun main() {
    val n = 20 
    
    if (n <= 0) {
        println("n debe ser mayor a 0")
        return
    }

    val resultado = mutableListOf<Long>()
    
    var valorImparAnterior: Long = 1
    var contadorImpar = 1

    for (i in 0 until n) {
        if (i % 2 == 0) {
            resultado.add(obtenerFibonacci(i))
        } else {
            if (i == 1) {
                resultado.add(1)
                valorImparAnterior = 1
                contadorImpar = 1
            } else {
                val nuevoValor = (valorImparAnterior * contadorImpar) + 1
                resultado.add(nuevoValor)
                
                valorImparAnterior = nuevoValor
                contadorImpar++ 
            }
        }
    }

    println("Entrada n: $n")
    println("Serie generada: ${resultado.joinToString(", ")}")
}

fun obtenerFibonacci(posicion: Int): Long {
    if (posicion == 0) return 0
    if (posicion == 1) return 1
    
    var a: Long = 0
    var b: Long = 1
    
    for (k in 2..posicion) {
        val suma = a + b
        a = b
        b = suma
    }
    return b
}