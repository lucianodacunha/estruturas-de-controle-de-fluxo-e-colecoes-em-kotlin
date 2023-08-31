package net.lucianodacunha.flow

class Animal(val name: String)

/**
 * A Operator function iterator possível que a classe torne-se iterável.
 * Ou seja, poderia ser percorrida sequencialmente por um for, como uma
 * lista, array, etc.
 */
class Zoo(val animals: List<Animal>){
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main(){
    val animals = listOf(
        Animal("cachorro"),
        Animal("gato"),
        Animal("zebra"))

    val zoo = Zoo(animals)

    for (animal in zoo){
        println(animal.name)
    }
}