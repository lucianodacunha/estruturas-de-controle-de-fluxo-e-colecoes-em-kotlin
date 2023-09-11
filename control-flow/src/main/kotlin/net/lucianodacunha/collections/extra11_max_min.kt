package net.lucianodacunha.collections.functions

import java.util.NoSuchElementException

/**
 * min, max
 */
fun main(){
    val persons = getPersons(5)

    /**
     * considerando a seguinte coleção:
     */
    println("-----------------------------------")
    println("DADOS:")
    println("-----------------------------------")
    println(String.format("%-25s%-5s%s", "Name", "Age", "> 40"))
    persons.forEach{
        println(
            String.format("%-25s%-5s%s", it.name, it.age, (it.age > 40))
        )
    }

    println("-----------------------------------")
    /**
     * Podemos obter alguns indicadores, ex.
     * min e max de uma coleção
     */
    println("INDICADORES: ")
    println("-----------------------------------")
    println("Menor idade: ${ persons.minOf { it.age } }")
    println("Maior idade: ${ persons.maxOf { it.age } }")

    /**
     * min/maxOf, poderá retornar uma exception caso a coleção esteja vazia.
     */
    try {
        listOf<Int>().maxOf { it }
    } catch (e: NoSuchElementException) {
        println("Erro: ${e.message}")
    }

    /**
     * Para evitar esse problema, podemos utilizar o maxByOrNull
     */
    println("Maior ou nulo? ${listOf<Int>().maxByOrNull { it }}")

    /**
     * maxByOrNull, retorna a representação String do objeto,
     * diferente do max, que retorna somente o maior referente a uma propriedade.
     */
    println("Elementos de maior idade: ${ persons.maxByOrNull { it.age } }")
}
