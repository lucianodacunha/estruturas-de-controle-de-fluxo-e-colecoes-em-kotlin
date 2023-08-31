package net.lucianodacunha.collections

/**
 * Demonstra a utilização de listas.
 * No Kotlin, utilizar a interface List gera uma lista somente leitura.
 * Para gerar listas alteráveis, deve-se utilizar a interce mutableList
 */
fun main(){
    val users: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    val sudoers: List<Int> = users

    fun addNewUser(newInt: Int){
        users.add(newInt)
    }

    fun getSudoersList(): List<Int> {
        return sudoers
    }

    addNewUser(5)
    addNewUser(6)

    sudoers.forEach {
        i -> print("$i ")
    }
}