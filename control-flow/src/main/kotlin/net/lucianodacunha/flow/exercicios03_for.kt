package net.lucianodacunha.flow

/**
 * # 45. For
 */
fun imprimeIntervaloCresc(max: Int) {
    for (i in 1..max){
        print("$i ")
    }
}

fun imprimeIntervaloDesc(max: Int) {
    for (i in max downTo 1){
        print("$i ")
    }
}

fun imprimeIntervaloCresc2(max: Int) {
    for (i in 1..max){
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

fun somaNumerosIntervalo(max: Int) {
    var soma = 0

    for (i in 1..max){
        soma += i
    }

    println("Soma do intervalo: 1 .. $max => $soma")
}

fun imprimeMatrizCaracter(max: Int){
    for (i in 1..max){
        for (j in 1..i){
            print("#")
        }
        println()
    }
}

fun main(){
//    imprimeIntervaloCresc(50)
//    println()
//    imprimeIntervaloDesc(50)
//    println()
//    imprimeIntervaloCresc2(50)
//    println()
//    somaNumerosIntervalo(500)
    imprimeMatrizCaracter(5)
}