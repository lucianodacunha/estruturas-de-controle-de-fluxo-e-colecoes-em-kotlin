package net.lucianodacunha.collections.functions

/**
 * average, calcula a média dos valores dos itens de uma coleção
 * Para objetos, será preciso transformar o dado em primitivo.
 */
fun main(){
    val pessoas = getPersons(5)

    /**
     * transnformando as idades da coleção em uma lista de inteiros
     * e posteriormente, calculando a média com average.
     */
    println("Média das idades: ${pessoas.map { it.age }.average()}")
}