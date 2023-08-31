package net.lucianodacunha.flow

fun main(){
    // utilizando loop com chars
    for(l in 'a'..'z'){
        print("$l ")
    }
    println()
    for(l in 'z' downTo 'a'){
        print("$l ")
    }

    println()
    // utilizando intervalos em condicionais
    if(10 in 1..20){
        println("10 está no intervalo")
    }
}