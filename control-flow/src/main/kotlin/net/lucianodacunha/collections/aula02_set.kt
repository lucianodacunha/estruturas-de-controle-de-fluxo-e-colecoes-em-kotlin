package net.lucianodacunha.collections

/**
 * Utilização da estrutura de dados set.
 * Nessa estrutura, não é permitido a inclusão de elementos duplicados.
 * O método add adiciona um novo elemento ao conjunto, retornado true/false
 */
fun main(){
    val set1: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)
    var success: Boolean

    success = set1.add(1)
    println("Item inserido com sucesso? $success")

    success = set1.add(5)
    println("Item inserido com sucesso? $success")

    success = set1.add(3)
    println("Item inserido com sucesso? $success")

}