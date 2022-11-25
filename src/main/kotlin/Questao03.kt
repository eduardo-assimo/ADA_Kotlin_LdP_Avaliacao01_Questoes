fun main() {
    val lista = mutableListOf<Int>()
    var n: Int
    repeat(15) {
        println("Digite um número: ")
        n = readln().toInt()
        lista.add(n)
    }

    lista.reverse()

    lista.forEach{
        print("$it ")
    }
}