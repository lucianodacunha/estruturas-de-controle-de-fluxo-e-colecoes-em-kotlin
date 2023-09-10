package net.lucianodacunha.flow

/**
 * # 36 - Prática if/else
 *
 * 1. Escreva um programa para ajudar uma empresa calcular o bonus que os
 * funcionários receberão no final do ano. Os bônus são classificados por cargo.
 * a. Gerentes recebem R$ 2.000,00
 * b. Coordenadores recebem R$ 1.500,00
 * c. Engenheiros de software recebem R$ 1.000,00
 * d. Estagiários recebem R$ 500,00
 *
 * 2. Modifique o primeiro exercício para considerar o tempo de experiência no
 * cálculo de bônus.
 * a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso
 * contrário recebem R$ 3.000,00
 * b. Coordenadores com menos de 1 ano de xp recebem R$ 1.500,00, caso contrário
 * recebem R$ 1.800,00
 * c. Engenheiros de software recebem R$ 1.000,00
 * d. Estagiários recebem R$ 500,00
 *
 * 3. Qual o resultado das comparação abaixo?
 * a. (a && b && c && d)
 * b. (!a && !b && (c && d))
 * c. (a && (b || c) || d)
 * d. (a || ((!b && c)) || !d)
 */

// 1
// Exemplo com when
fun calcularBonus(cargo: String) = when(cargo.uppercase()) {
    "GERENTE" -> 2000.00
    "COORDENADOR" -> 1500.00
    "DESENVOLVEDOR" -> 1000.00
    "ESTAGIARIO" -> 500.00
    else -> {
        println("Cargo incorreto")
        0.0
    }
}

// 2
fun calcularBonus(cargo: String, xp: Int): Double {
    var bonus: Double = 0.0

    if (cargo.uppercase().equals("GERENTE")) {
        if (xp < 2) {
            bonus = 2000.0
        } else {
            bonus = 3000.0
        }
    } else if (cargo.uppercase().equals("COORDENADOR")){
        if (xp < 1) {
            bonus = 1500.00
        } else {
            bonus = 1800.00
        }
    } else if (cargo.uppercase().equals("DESENVOLVEDOR")) {
        bonus = 1000.00
    } else if (cargo.uppercase().equals("ESTAGIÁRIO")){
        bonus = 500.00
    } else {
        println("Cargo não cadastrado")
    }

    return bonus
}

// 3
fun comparacoes(){
    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    println(!a && !b && (c && d))
    println(a && (b || c) || d)
    println(a || ((!b && c)) || !d)
}

fun main(){
    println(calcularBonus("analista"))
    println(calcularBonus("gerente", 2))
    println(calcularBonus("coordenador", 2))
    println(calcularBonus("desenvolvedor", 2))
    comparacoes()
}