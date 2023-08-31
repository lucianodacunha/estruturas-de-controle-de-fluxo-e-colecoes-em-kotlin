package net.lucianodacunha.collections

fun main(){
    val nrs = listOf(1,2,4,5,6,6,7,7)

    val greather = nrs.filter{ x -> x > 5 }
    val less = nrs.filter{ it < 4}

    println("$less, $greather, $nrs")

    val nrs2 = listOf(1,2,4,5,6,6,7,7)
    val doubled = nrs2.map{y -> y * 2}

    val anyNegative = doubled.any{it > 3}
    println(anyNegative)

    val list1 = listOf(1,2,3,4)
    val list2 = listOf(5,6,7,8)

    val listMap = listOf(list1, list2)
    val normalMap = listMap.map{it}
    val flatMap = listMap.flatMap { it }
    println(normalMap)
    println(flatMap)
}