package net.lucianodacunha.collections.functions

/**
 * Any / Count
 */
fun main(){
    val listInteger = listOf(1, 2, 3, 4, 5)

    println("Existe algum elemento na lista? ${listInteger.any()}")
    println("Quantos elementos existem na lista? ${listInteger.count()}")
}
