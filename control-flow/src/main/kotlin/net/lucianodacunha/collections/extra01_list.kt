package net.lucianodacunha.collections.list

/**
 * Uma coleção é um conjunto de elementos. Quando criamos uma coleção, ganhamos
 * um conjunto de funções disponíveis para tratar essa estrutura de dados.
 * Mas nem todo conjunto de elementos poderá ser tratado como coleção.
 */

fun main(){
    // atalho para criar uma collection.
    val inteiros = listOf(1,2,3,4,5)

    // testa o tipo da variável.
    println("inteiros é uma Collection ${ inteiros is Collection<Int>}")
    println("inteiros é uma List ${ inteiros is List<Int>}")

    // outro tipo de List, nesse caso mutável.
    val inteirosMutaveis: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    // métodos
    // inteiros.add // Não temos métodos de add na lista padrão de Kotlin

    // adiciona um elemento no final
    inteirosMutaveis.add(6)
    println("inteirosMutaveis: $inteirosMutaveis")

    // remove um elemento no índice
    inteirosMutaveis.removeAt(4)
    println("inteirosMutaveis: $inteirosMutaveis")
    println("Contém 3 na inteirosMutaveis? ${ inteirosMutaveis.contains(3) }")

    // limpar uma lista, removendo todos os seus itens
    inteirosMutaveis.clear()
    println("inteirosMutaveis.clear(): $inteirosMutaveis")
}