package net.lucianodacunha.flow


/**
 * # 45. While
 */

// 1
fun simulaCaixaAgua(){
    val balao = 7
    val capacidadeCaixa = 2000
    var baloes = 0
    var quantidadeAgua = 0

    while ((quantidadeAgua + balao) <= capacidadeCaixa){
        quantidadeAgua += balao
        baloes++
    }

    println("Quantidade de balões: $baloes \nQuantidade de água: $quantidadeAgua")
}

// 2
fun fizzbuzz(){
    var i = 1
    while(i <= 50){
        var message: String = ""
        if (i % 5 == 0) message += "fizz"
        if (i % 3 == 0) message += "buzz"
        if (!message.isEmpty()) message = String.format("[%02d - %s]", i, message)
        if (i % 10 == 1) println()
        i++
        if (message.isNullOrBlank()) continue
        print("$message ")
    }
}

// 3
fun inverteTexto(text: String){
    var i = text.length
    while(i > 0){
        print("${ text[i-1] } ")
        i--
    }
}

// 4
fun contaCaracteres(str: String):Boolean{
    var i = 0
    var x = 0
    var o = 0
    while(i < str.length){
        if (str.lowercase()[i] == 'x') x++
        if (str.lowercase()[i] == 'o') o++
        i++
    }
    return if (x > 0 && o > 0) (x == o) else false
}

// desafio
fun calculaInvestimento(){
    val salario = 10000.0
    var saldoAna = 0.0
    var saldoPaula = 0.0
    var mes = 0

    while(saldoPaula <= saldoAna){
        var rendimentoMensalAna = (saldoAna * 0.002)
        saldoAna += ((salario * 0.05) * 2) + rendimentoMensalAna
        var rendimentoMensalPaula = (saldoPaula * 0.008)
        saldoPaula += ((salario * 0.05)) + rendimentoMensalPaula
        mes++
    }

    println(String.format("%s%.2f %s%.2f.", "Saldo Ana: ", saldoAna, "Saldo Paula: ", saldoPaula))
    println("Tempo: $mes meses.")
}


fun main(){
//    simulaCaixaAgua()
    fizzbuzz()
//    inverteTexto("Kotlin")
//    contaCaracteres("Kotlin")
//    println(contaCaracteres("xxooox"))
//    println(contaCaracteres("xxxxo"))
//    println(contaCaracteres("btgertertre"))
//    println(contaCaracteres("ooooxxxxzzzzz"))
//    calculaInvestimento()

}

