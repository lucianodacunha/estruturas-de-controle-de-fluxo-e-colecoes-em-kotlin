package net.lucianodacunha.flow

fun main(){
    val x = 42

    validate1(x)
    validate2(x)
}

// como uma expression
fun validate1(x: Int) =  if(x > 20) x else x

fun validate2(x: Int) {
    if (x < 20) {
        println(x)
    } else {
        println(x)
    }
}