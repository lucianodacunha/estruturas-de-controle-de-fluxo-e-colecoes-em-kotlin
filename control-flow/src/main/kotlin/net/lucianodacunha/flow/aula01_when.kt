package net.lucianodacunha.flow

/**
 * Exemplificando a utilização do when statement, como se fosse o switch case do
 * Java.
 *
 */
fun main(){
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any){
    when(obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown") // else
    }
}

class MyClass