fun main() {
    println("\nDigite um número de 1 a 10: ")
    val n = readln().toIntOrNull()
    n?.let {
        if (it in 1..10) {
            repeat(10) { index ->
                println("${index.inc()} X $it = ${(index.inc()*it)}")
            }
        }
        else {
            println("\nNão foi digitado um número dentro do intervalo de 1 a 10.")
        }
    } ?:run {
        println("\nNão foi digitado um número.")
    }
}