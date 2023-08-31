package net.lucianodacunha.flow

/**
 * Exemplo demonstrando a utilização do when como expressão.
 * Nesse caso, seu resultado já é atribuído a uma variável de retorno.
 */

fun main(){
    println(whenAssign("Hello"))
    println(whenAssign(1))
    println(whenAssign(0L))
    println(whenAssign(MyClass()))
    println(whenAssign("hello"))
}

fun whenAssign(obj: Any): Any{
    val result = when(obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown" // else
    }
    return result
}
