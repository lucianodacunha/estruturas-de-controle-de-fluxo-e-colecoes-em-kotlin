package net.lucianodacunha.collections.functions

/**
 * forEach
 */
fun main(){
    val persons = getPersons(10)

    println(String.format("%-25s%-5s%s", "Name", "Age", "> 40"))
    // forEach, utilizado para iterar sobre os elementos da coleção.
    persons.forEach{
        println(
            String.format("%-25s%-5s%s", it.name, it.age, (it.age > 40))
        )
    }

    // pelo fato de ter o predicado{}, é possível utilizar outros operadores
    // ex. operadores condicionais.
//    println("Utilizando operadores condicionais: ")
//    persons.forEach {
//        println("Pessoa tem mais que 40 anos? ${ it.age > 40 }")
//    }
}