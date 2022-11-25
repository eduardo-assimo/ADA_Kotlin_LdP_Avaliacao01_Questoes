fun main() {
    val lista= mutableListOf<Int>()
    repeat(10) {
        println("Digite um valor: ")
        lista.add(readln().toInt())
    }
    lista.sortBy{it}
    println("O maior valor é ${lista.last()} e o menor valor é ${lista.first()}")
}