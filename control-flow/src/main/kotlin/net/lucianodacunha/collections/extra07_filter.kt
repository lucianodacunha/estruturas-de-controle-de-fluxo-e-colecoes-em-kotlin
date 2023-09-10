package net.lucianodacunha.collections.functions


/**
 * utilização do fitler com predicado
 */
fun main(){
    val lista = getPersons(10)
    /**
     * filtra itens da lista de acordo com o predicado informado.
     * Predicado é a condição informada dentro das chaves.
     */
    lista.filter { it.age > 30 }.forEach {
        person -> println(person)
    }

    /**
     * Assim como filter, count também permite a utilização de predicados
     */
    println("Pessoas com menos de 30 anos: ${ lista.count { it.age < 30 } }")
}