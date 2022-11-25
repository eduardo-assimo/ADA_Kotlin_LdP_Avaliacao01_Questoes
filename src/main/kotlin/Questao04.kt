fun main() {
    var qVotosCandidatoA = 0
    var qVotosCandidatoB = 0
    var qVotosCandidatoC = 0
    println("Digite a quantidade de eleitores: ")
    val qEleitores = readln().toInt()
    var candidato: String

    for (i in 1..qEleitores) {
        println("Eleitor $i Informe seu voto - digite A para votar no candidato A, digite B para votar no candidato B e digite C para votar no candidato C: ")
        candidato = readln()
        when (candidato.uppercase()) {
            "A" -> qVotosCandidatoA++
            "B" -> qVotosCandidatoB++
            "C" -> qVotosCandidatoC++
        }
    }
    println("A quantidade de votos do candidato A foi de $qVotosCandidatoA que corresponde a ${porcentagemVotos(qVotosCandidatoA, qEleitores)}% do total de votos.")
    println("A quantidade de votos do candidato B foi de $qVotosCandidatoB que corresponde a ${porcentagemVotos(qVotosCandidatoB, qEleitores)}% do total de votos.")
    println("A quantidade de votos do candidato C foi de $qVotosCandidatoC que corresponde a ${porcentagemVotos(qVotosCandidatoC, qEleitores)}% do total de votos.")
}

fun porcentagemVotos(vParcial: Int, vTotal: Int) : Double {
    return (vParcial.toDouble()/vTotal.toDouble()) * 100
}