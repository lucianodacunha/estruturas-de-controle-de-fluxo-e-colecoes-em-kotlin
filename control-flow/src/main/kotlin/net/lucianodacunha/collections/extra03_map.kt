package net.lucianodacunha.collections.map

import io.github.serpro69.kfaker.Faker

/**
 * Map é uma coleção do tipo chave: valor
 * Também não aceita repetidos, nesse caso, na chave.
 * Caso seja informado valores repetidos, o último será mantido.
 * A inclusão de dados no map é definida por um Pair de elementos.
 */
fun main(){
    val faker = Faker()

    // criando o map
    val map1 = mapOf(
        Pair(faker.barcode.ean13(), faker.address.country()),
        Pair(faker.barcode.ean13(), faker.address.country()),
        Pair(faker.barcode.ean13(), faker.address.country()),
        Pair(faker.barcode.ean13(), faker.address.country()),
    )

    // imprime o map
    println(map1)

    // retorna todas as chaves
    println("Chaves: ${map1.keys}")

    // retorna todos os valores
    println("Valores: ${map1.values}")

    // retorna o valor, da chave informada, caso contrário, a mensagem.
    println("Buscando pela chave 830349132685: ${ map1.getOrElse("232344343", { "Valor não encontrado." }) }")
}