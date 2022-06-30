package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String  = "Thais"
    var cpf: String = "123.123.123-10"
}

fun main() {
     val thais = Pessoa()

    println(thais.nome)
    println(thais.cpf)
}