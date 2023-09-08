package net.lucianodacunha.flow

/**
 * # 39
 * 1. Escreva um programa capaz de ler dois números inteiros que representam os
 * lados de uma figura geométrica. Informar se formam um quadrado (lados iguais).
 *
 * 2. Escreve um programa capaz de ler três números inteiros que represntam os
 * lados de um triângulo. Informar se é um triângulo equilátero (todos os lados
 * iguais).
 *
 * 3. Considere o código abaixo. Qual a saída do programa caso informado o valor
 * 4.
 *
 * 4. Escreva um programa para ser usado na portaria de um evento.
 * a. Entrar com idade, menores não são permitidos.
 * b. Entrar com o convite e tipo, tipos: COMUM/XT, PREMIUM/XL, LUXO/XL.
 */

// 1
fun verificaSeEhUmQuadrado(){

    print("Entre com o lado a: ")
    val a = readln()
    print("Entre com o lado b: ")
    val b = readln()

    if (a == b) {
        println("É um quadrado.")
    } else {
        println("Não é um quadrado.")
    }
}

// 2
fun verificaSeEhUmTriangulo(){
    print("Entre com o lado a: ")
    val a = readln()
    print("Entre com o lado b: ")
    val b = readln()
    print("Entre com o lado c: ")
    val c = readln()

    if (a == b && b == c) {
        println("Triângulo equilátero")
    } else if (a == b || b == c || a == c) {
        println("Triângulo isósceles")
    } else {
        println("Triângulo escaleno")
    }
}

// 3
fun qualASaida(num: Int) {
    if (num >=0){
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

// 4
fun portaria(){
    var mensagem = ""

    print("Entre com sua idade: ")
    val idade = readln().toInt()
    if (idade < 18){
        mensagem = "Negado. Menores de idade não são permitidos."
    } else {
        print("Entre com o tipo do convite: ")
        val tipoConvite = readln().uppercase()
        if (tipoConvite.equals("COMUM")) {
            print("Entre com o código do convite: ")
            val codigoConvite = readln().uppercase()
            if (codigoConvite.startsWith("XT")) {
                mensagem = "Seja bem-vindo!"
            } else {
                mensagem = "Negado. Convite inválido"
            }
        } else if (tipoConvite.equals("PREMIUM") || tipoConvite.equals("LUXO")) {
            print("Entre com o código do convite: ")
            val codigoConvite = readln().uppercase()
            if (codigoConvite.startsWith("XL")) {
                mensagem = "Seja bem-vindo!"
            } else {
                mensagem = "Negado. Menores de idade não são permitidos."
            }
        } else {
            mensagem = "Negado. Convite inválido"
        }
    }

    println(mensagem)
}


fun main(){
//    verificaSeEhUmQuadrado()
//    verificaSeEhUmTriangulo()
//    qualASaida(num = 4)
    portaria()
}