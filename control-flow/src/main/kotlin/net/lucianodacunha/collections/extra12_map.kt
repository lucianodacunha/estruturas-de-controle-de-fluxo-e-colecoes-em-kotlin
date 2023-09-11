package net.lucianodacunha.collections.functions

/**
 * map, altera a estrutura de dados entrada.
 * retorna uma lista, aplicando uma data função sobre casa elemento da
 * coleção original.
 */
fun main(){
    val persons = getPersons(5)

    listar(persons)

    /**
     * Aplica a função envelhecer sobre cada item da coleção
     * deixando cada pessoa 5 anos mais velha.
     */
    persons.map { envelhecer(it, 5) }
    println("-----------------------------------")
    listar(persons)
}

/**
 * Adiciona anos de vida a propriedade age de um objeto Person.
 */
fun envelhecer(pessoa: Person, anos: Int){
    pessoa.age += anos
}

/**
 * Lista a coleção de Person, com Strings formatadas.
 */
fun listar(lista: List<Person>){
    println(String.format("%-25s%-5s%s", "Name", "Age", "> 40"))
    lista.forEach{
        println(String.format("%-25s%-5s%s", it.name, it.age, (it.age > 40)))
    }
}