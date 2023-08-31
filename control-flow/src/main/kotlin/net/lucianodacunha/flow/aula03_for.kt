package net.lucianodacunha.flow

/**
 * Exemplificação do uso do loop for com Kotlin.
 */
fun main(){

    // listOf é uma função builtin que criar uma lista de elementos.
    val cakes = listOf("carrot", "cheese", "chocolate")

    for(cake in cakes){
        println("Yummy, it's a $cake cake")
    }

    for (number in 1..5){
        print("$number ")
    }
}