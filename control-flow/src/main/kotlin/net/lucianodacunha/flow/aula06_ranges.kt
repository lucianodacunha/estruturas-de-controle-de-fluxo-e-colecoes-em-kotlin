package net.lucianodacunha.flow



fun main(){
    // intervalo definido.
    for(i in 1..3){
        print("$i ")
    }
    println()
    // exemplo que utiliza until, exclusive.
    for(i in 1 until 5){
        print("$i ")
    }
    println()
    // exemplo que utiiliza passos
    for(i in 1..10 step 2){
        print("$i ")
    }
    println()
    for(i in 6 downTo 1){
        print("$i ")
    }
}