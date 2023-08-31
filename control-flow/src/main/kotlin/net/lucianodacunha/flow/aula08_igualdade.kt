package net.lucianodacunha.flow

fun main(){

    val str1 = "Kotlin"
    val str2 = "kotlin"
    val str3 = str1

    println(str1 == str2)
    println(str1 == str3)
    println(str2 == str3)

    println(str1 === str2)
    println(str1 === str3)
    println(str2 === str3)

    val num1 = 42
    val num2 = num1
    val num3 = num1 + 1

    println(num1 == num2)
    println(num2 == num3)
    println(num1 == num3)

    println(num1 === num2)
    println(num2 === num3)
    println(num1 === num3)

    val set1 = setOf(1, 2, 3)
    val set2 = setOf(2, 3, 1)

    println(set1 == set2) // compara a estrutura dos objetos.
    println(set1 === set2)
}