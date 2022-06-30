package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val thais = Pessoa(nome = "Thais", cpf = "123.345.678-90")
    println(thais.nome)
    println(thais.cpf)

    val carlos = Funcionario( nome = "Carlos", cpf = "123.123.123-40", salario = BigDecimal(2000.00))
    println(carlos.nome)
    println(carlos.cpf)
    println(carlos.salario)
}