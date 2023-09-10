package net.lucianodacunha.collections.set

/**
 * Set não aceita valores repetidos
 * não possui indice.
 */
fun main(){

    // criação de set
    // imutável
    val set1 = setOf(1,2,3,4,5)
    // mutável
    val set2 = mutableSetOf(1,2,3,4,5)

    // validação dos tipos
    println("set1 é uma Collection ${ set1 is Collection<Int>}")
    println("set1 é uma List ${ set1 is Set<Int>}")

    println("set1: $set1")
    println("set2: $set2")

    // inclusão de elementos
    set2.add(1) // não adiciona itens repetidos.
    set2.add(6)
    println("set2: $set2")

    set2.forEach { i -> print("$i ") }
    println()

    // tamanho do set, quantidade de elementos
    println("Tamanho do set1: ${set1.size}")

    // adiciona todos os elementos do novo conjunto ao existente
    set2.addAll(setOf(6,7,8,9,0,1))
    println("Set2: $set2")
}