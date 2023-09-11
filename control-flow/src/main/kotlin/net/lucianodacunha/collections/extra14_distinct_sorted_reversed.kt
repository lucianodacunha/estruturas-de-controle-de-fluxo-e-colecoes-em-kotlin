package net.lucianodacunha.collections.functions

/**
 * distinct
 * sorted
 * reversed
 */
fun main(){
    val ints = listOf(1,9,1,1,8,1,3,4,5,6,7,8,9,8,1,6,4,3,6,0)
    val persons = getPersons(5)

    /**
     * Utilização das funções com lista de primitivos.
     */
    println("Lista completa: $ints")
    println("Quantidade de elementos: ${ints.count()}")
    println("Lista somente com valores únicos: ${ints.distinct()}")
    println("Quantidade de elementos únicos: ${ints.distinct().count()}")
    println("Lista ordenada: ${ints.sorted()}")
    println("Lista de únicos ordenada: ${ints.distinct().sorted()}")
    println("-----------------------------------")
    /**
     * Utilização das funções com lista de objetos
     * Listagem de objetos ordenados por idade
     */
    println(String.format("%-25s%-5s%s", "Name", "Age", "> 40"))
    persons.sortedBy { it.age }.forEach{
        println(
            String.format("%-25s%-5s%s", it.name, it.age, (it.age > 40))
        )
    }
    println("-----------------------------------")
    /**
     * * Listagem de objetos ordenados por idade em ordem inversa.
     */
    println(String.format("%-25s%-5s%s", "Name", "Age", "> 40"))
    persons.sortedBy{ it.age }.reversed().forEach{
        println(
            String.format("%-25s%-5s%s", it.name, it.age, (it.age > 40))
        )
    }

}