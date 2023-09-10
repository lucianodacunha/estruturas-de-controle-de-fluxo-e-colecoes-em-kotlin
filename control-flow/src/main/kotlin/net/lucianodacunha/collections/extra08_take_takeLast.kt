package net.lucianodacunha.collections.functions

/**
 * take / takeLast
 */
fun main(){
    val lista = getPersons(10)

    println("Duas primeiras pessoas da lista ${lista.take(2)}")
    println("Duas últimas pessoas da lista ${lista.takeLast(2)}")
}