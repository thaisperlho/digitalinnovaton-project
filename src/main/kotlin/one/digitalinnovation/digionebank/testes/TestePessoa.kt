package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val thais = Pessoa(nome = "Thais", cpf = "123.345.678-90")
    println(thais.nome)
    println(thais.cpf)
}