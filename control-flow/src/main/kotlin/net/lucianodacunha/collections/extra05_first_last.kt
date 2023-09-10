package net.lucianodacunha.collections.functions

/**
 * first / last
 */
fun main(){
    val listInteger = listOf(1, 2, 3, 4, 5)

    println("Primeiro elemento na lista? ${listInteger.first()}")
    println("Último elemento na lista? ${listInteger.last()}")

    // porem caso a lista esteja vazia, uma exception será lançada
    try {
        println("Primeiro elemento da lista: ${listOf<Int>().first()}")
    } catch(e: Exception ) {
        println("Erro: ${e.message}")
    }
}
