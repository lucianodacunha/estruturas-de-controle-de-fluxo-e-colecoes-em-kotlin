package net.lucianodacunha.collections.functions

import io.github.serpro69.kfaker.Faker

data class Person(val name: String, val age: Int)

fun main(){
    val lista = listOf<Int>(1,2,3,4,5)
    val listaDePessoas = getPersons(5)

    // sum é utilizado para soma os elementos de uma lista.
    // Nesse caso, os elementos precisam ser dados primitivos.
    println("Soma dos itens da lista: ${lista.sum()}")

    /**
     * sumOf soma as propriedade dos objetos de uma lista.
     * Desta forma, utilizamos o it e o operador ponto para acessar a propriedade
     * que será utilizada na soma.
     */
    println("Soma das idades das pessoas da lista: ${listaDePessoas.sumOf { it.age }}")
}

/**
 * Retorna uma lista de pessoas
 */
fun getPersons(quantity: Int) : MutableList<Person> {
    val listaDePessoas: MutableList<Person> = mutableListOf()
    val faker = Faker()

    for (person in 1.. quantity){
        listaDePessoas.add(
            Person(faker.name.name(), faker.random.nextInt(18, 80))
        )
    }

    return listaDePessoas
}