package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String  = "Thais"
    var cpf: String = "123.123.123-10"
    private set

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val thais = Pessoa()
    println(thais.pessoaInfo())
}