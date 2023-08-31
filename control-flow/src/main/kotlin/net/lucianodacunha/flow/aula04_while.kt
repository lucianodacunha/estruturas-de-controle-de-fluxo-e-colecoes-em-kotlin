package net.lucianodacunha.flow

fun main(){
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5){
        eatCake(cakesEaten)
        cakesEaten++
    }

    do {
        bakeCake(cakesBaked)
        cakesBaked++
    }while (cakesBaked < 5)
}

fun eatCake(quantity: Int){
    println("$quantity eaten cakes...")
}

fun bakeCake(quantity: Int){
    println("$quantity baked cakes..")
}