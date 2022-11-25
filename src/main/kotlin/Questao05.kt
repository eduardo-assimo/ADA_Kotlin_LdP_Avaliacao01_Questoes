fun main() {
    val lista = mutableListOf<Int>()
    println("\nDigite um número inteiro positivo: ")
    val n: Int = readln().toInt()
    for (i in 1..n) {
        if (ehPrimo(i)) {
            lista.add(i)
        }
    }
    print("\nA lista de números primos no intervalo entre 1 e o número informado é: ")
    lista.forEach {
        print("$it ")
    }
}

fun ehPrimo(num:Int) :Boolean {
    if(num == 1){
        return false
    }
    if(num != 2 && num % 2 == 0) {
        return false
    }
    if(num != 3 && num % 3 == 0) {
        return false
    }
    if(num != 5 && num % 5 == 0) {
        return false
    }
    if(num != 7 && num % 7 == 0) {
        return false
    }
    if(num !=11 && num % 11 == 0) {
        return false
    }
    return true
}